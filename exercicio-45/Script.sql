DROP DATABASE IF EXISTS pessoa;
CREATE DATABASE pessoa;
USE pessoa;

CREATE TABLE pessoas (
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         nome VARCHAR(100) NOT NULL,
                         idade INT,
                         email VARCHAR(100)
);

DESCRIBE pessoas;

INSERT INTO pessoas (nome, idade, email)
VALUES ('Maria Silva', 25, 'maria@gmail.com');

INSERT INTO pessoas (nome, idade, email)
VALUES
    ('João Souza', 30, 'joao@gmail.com'),
    ('Ana Lima', 22, 'ana@gmail.com'),
    ('Carlos Mendes', 40, 'carlos@gmail.com');

SELECT * FROM pessoas;

SELECT nome, email
FROM pessoas;

SELECT *
FROM pessoas
WHERE idade >= 18;

SELECT *
FROM pessoas
WHERE nome = 'Ana Lima';

UPDATE pessoas
SET idade = 26
WHERE id = 1;

UPDATE pessoas
SET email = 'novoemail@gmail.com'
WHERE nome = 'João Souza';

DELETE FROM pessoas
WHERE id = 3;

SELECT * FROM pessoas;