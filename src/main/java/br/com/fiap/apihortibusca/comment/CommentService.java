package br.com.fiap.apihortibusca.comment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

        private final CommentRepository commentRepository;

        public CommentService(CommentRepository commentRepository) {
            this.commentRepository = commentRepository;
        }

        public List<Comment> findAll() {
            return commentRepository.findAll();
        }

        public Comment create(Comment comment) {
            return commentRepository.save(comment);
        }

        public List<Comment> findByItemId(Long itemId) {
            return commentRepository.findByItemId(itemId);
        }
}
