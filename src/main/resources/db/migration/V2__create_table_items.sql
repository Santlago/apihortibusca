CREATE TABLE tb_hb_items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    description TEXT,
    image VARCHAR(255),
    category VARCHAR(255)
);

INSERT INTO tb_hb_items (name, price, description, image, category) VALUES
    ('Banana', 1.20, 'Bananas frescas', 'banana.png', 'FRUTAS'),
('Maçã', 1.50, 'Maçãs vermelhas crocantes', 'maca.png', 'FRUTAS'),
('Laranja', 1.30, 'Laranjas suculentas', 'laranja.png', 'FRUTAS'),
('Repolho', 0.80, 'Repolho verde', 'repolho.png', 'VEGETAIS'),
('Cenoura', 0.90, 'Cenouras orgânicas', 'cenoura.png', 'VEGETAIS'),
('Tomate', 1.10, 'Tomates maduros', 'tomate.png', 'VEGETAIS'),
('Batata', 0.70, 'Batatas frescas', 'batata.png', 'TUBERCULOS'),
('Alface', 0.60, 'Alface crocante', 'alface.png', 'VEGETAIS'),
('Morango', 2.00, 'Morangos doces', 'morango.png', 'FRUTAS'),
('Uvas', 2.50, 'Uvas sem sementes', 'uvas.png', 'FRUTAS'),
('Abacaxi', 3.00, 'Abacaxis suculentos', 'abacaxi.png', 'FRUTAS'),
('Pepino', 1.20, 'Pepinos frescos', 'pepino.png', 'VEGETAIS'),
('Cebola', 0.90, 'Cebolas orgânicas', 'cebola.png', 'VEGETAIS'),
('Alho', 1.50, 'Alhos frescos', 'alho.png', 'ERVAS'),
('Gengibre', 2.00, 'Gengibres frescos', 'gengibre.png', 'ERVAS'),
('Batata Doce', 1.80, 'Batatas doces frescas', 'batata_doce.png', 'TUBERCULOS'),
('Couve', 1.00, 'Couve verde', 'couve.png', 'VEGETAIS'),
('Pimentão', 1.50, 'Pimentões coloridos', 'pimentao.png', 'VEGETAIS'),
('Rúcula', 1.20, 'Rúcula fresca', 'rucula.png', 'VEGETAIS'),
('Manjericão', 1.00, 'Manjericão fresco', 'manjericao.png', 'ERVAS');