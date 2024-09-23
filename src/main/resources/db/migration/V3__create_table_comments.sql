CREATE TABLE tb_hb_comments (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    comment TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_id BIGINT,
    item_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES tb_hb_users(id),
    FOREIGN KEY (item_id) REFERENCES tb_hb_items(id)
);

INSERT INTO tb_hb_comments (comment, created_at, user_id, item_id) VALUES
('Great product!', '2023-01-01 10:00:00', 1, 1),
('Very fresh and tasty.', '2023-02-01 11:00:00', 2, 1),
('Will buy again.', '2023-03-01 12:00:00', 3, 1),
('Highly recommend.', '2023-04-01 13:00:00', 4, 1),
('Excellent quality.', '2023-05-01 14:00:00', 5, 1);