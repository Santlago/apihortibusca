package br.com.fiap.apihortibusca.user.dto;

import br.com.fiap.apihortibusca.user.User;

import java.time.LocalDateTime;

public record UserFormRequest(
        String name,
        String email,
        String password,
        String address,
        String phone
) {
    public User toModel() {
        return User.builder()
                .name(name)
                .email(email)
                .password(password)
                .address(address)
                .phone(phone)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
