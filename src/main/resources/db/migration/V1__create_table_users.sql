CREATE TABLE tb_hb_users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    phone VARCHAR(20),
    avatar VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

INSERT INTO tb_hb_users (name, email, password, address, phone, avatar, created_at, updated_at) VALUES
('Lurdes', 'lurdes@gmail.com', '$2a$12$3rKm6w8NvXYA52o0SyrFquMEYxlCgYFvFXVzZ6FbSaNObEiIxmleq', '123 Main St', '123-456-7890', 'avatar1.png', '2023-01-01 10:00:00', '2023-01-01 10:00:00'),
('Jane Smith', 'jane.smith@example.com', '$2a$12$3rKm6w8NvXYA52o0SyrFquMEYxlCgYFvFXVzZ6FbSaNObEiIxmleq', '456 Elm St', '234-567-8901', 'avatar2.png', '2023-02-01 11:00:00', '2023-02-01 11:00:00'),
('Alice Johnson', 'alice.johnson@example.com', '$2a$12$3rKm6w8NvXYA52o0SyrFquMEYxlCgYFvFXVzZ6FbSaNObEiIxmleq', '789 Oak St', '345-678-9012', 'avatar3.png', '2023-03-01 12:00:00', '2023-03-01 12:00:00'),
('Bob Brown', 'bob.brown@example.com', '$2a$12$3rKm6w8NvXYA52o0SyrFquMEYxlCgYFvFXVzZ6FbSaNObEiIxmleq', '101 Pine St', '456-789-0123', 'avatar4.png', '2023-04-01 13:00:00', '2023-04-01 13:00:00'),
('Charlie Davis', 'charlie.davis@example.com', '$2a$12$3rKm6w8NvXYA52o0SyrFquMEYxlCgYFvFXVzZ6FbSaNObEiIxmleq', '202 Maple St', '567-890-1234', 'avatar5.png', '2023-05-01 14:00:00', '2023-05-01 14:00:00');