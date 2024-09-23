package br.com.fiap.apihortibusca.comment.dto;

import br.com.fiap.apihortibusca.comment.Comment;
import br.com.fiap.apihortibusca.item.Item;
import br.com.fiap.apihortibusca.user.User;

import java.time.LocalDateTime;

public record CommentFormRequest(
    String comment,
    LocalDateTime createdAt,
    Long itemId,
    Long userId
) {
    public Comment toModel(Item item, User user) {
        return Comment.builder()
                .comment(comment)
                .createdAt(LocalDateTime.now())
                .item(item)
                .user(user)
                .build();
    }
}