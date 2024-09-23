package br.com.fiap.apihortibusca.user.dto;

import br.com.fiap.apihortibusca.user.User;

import java.time.LocalDateTime;

public record UserResponse(
        Long id,
        String name,
        String email,
        String address,
        String phone,
        LocalDateTime createdAt
) {
    public static UserResponse fromUser(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getAddress(),
                user.getPhone(),
                user.getCreatedAt()
        );
    }
}
