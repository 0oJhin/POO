DROP DATABASE IF EXISTS loja;
CREATE DATABASE loja;
USE loja;

CREATE TABLE produtos (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          nome VARCHAR(100) NOT NULL,
                          preco DECIMAL(10,2),
                          quantidade INT
);

DESCRIBE produtos;

INSERT INTO produtos (nome, preco, quantidade)
VALUES ('Notebook', 3500.00, 10);

INSERT INTO produtos (nome, preco, quantidade)
VALUES
    ('Mouse', 80.00, 50),
    ('Teclado', 150.00, 30),
    ('Monitor', 1200.00, 15);

SELECT * FROM produtos;

SELECT nome, preco
FROM produtos;

SELECT *
FROM produtos
WHERE preco > 100;

SELECT *
FROM produtos
WHERE nome = 'Mouse';

UPDATE produtos
SET preco = 3400.00
WHERE id = 1;

UPDATE produtos
SET quantidade = 45
WHERE nome = 'Mouse';

DELETE FROM produtos
WHERE id = 3;

SELECT * FROM produtos;