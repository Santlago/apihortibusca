package br.com.fiap.apihortibusca.comment;

import br.com.fiap.apihortibusca.comment.dto.CommentFormRequest;
import br.com.fiap.apihortibusca.item.Item;
import br.com.fiap.apihortibusca.item.ItemRepository;
import br.com.fiap.apihortibusca.user.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;
    private final UserRepository userRepository;
    private final ItemRepository itemRepository;

    public CommentController(CommentService commentService, UserRepository userRepository, ItemRepository itemRepository) {
        this.commentService = commentService;
        this.userRepository = userRepository;
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @PostMapping
    public Comment create(@RequestBody CommentFormRequest commentFormRequest){
        var email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        var user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        var item = itemRepository.findById(commentFormRequest.itemId())
                .orElseThrow(() -> new RuntimeException("Item not found"));
        var comment = commentFormRequest.toModel(item, user);
        return commentService.create(comment);
    }

    @GetMapping("/item/{itemId}")
    public List<Comment> findByItemId(@PathVariable Long itemId) {
        return commentService.findByItemId(itemId);
    }


}
