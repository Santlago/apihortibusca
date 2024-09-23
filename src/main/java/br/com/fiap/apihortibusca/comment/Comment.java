package br.com.fiap.apihortibusca.comment;

import br.com.fiap.apihortibusca.item.Item;
import br.com.fiap.apihortibusca.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_hb_comments")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String comment;
    LocalDateTime createdAt;

    @ManyToOne
    Item item;

    @ManyToOne
    User user;
}
