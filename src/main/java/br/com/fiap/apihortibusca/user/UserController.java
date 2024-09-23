package br.com.fiap.apihortibusca.user;

import br.com.fiap.apihortibusca.user.dto.UserFormRequest;
import br.com.fiap.apihortibusca.user.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public ResponseEntity<UserResponse> create (@RequestBody UserFormRequest userFormRequest, UriComponentsBuilder uriBuilder) {
        System.out.println(userFormRequest);
        var user = userService.create(userFormRequest.toModel());
        var uri = uriBuilder
                .path("/users/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        return ResponseEntity.created(uri).body(UserResponse.fromUser(user));
    }

}
