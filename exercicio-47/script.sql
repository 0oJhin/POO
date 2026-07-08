DROP DATABASE IF EXISTS escola;
CREATE DATABASE escola;
USE escola;

CREATE TABLE alunos (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        nome VARCHAR(100) NOT NULL,
                        curso VARCHAR(100),
                        nota DECIMAL(4,2)
);

DESCRIBE alunos;

INSERT INTO alunos (nome, curso, nota)
VALUES ('Pedro Silva', 'Engenharia da Computação', 8.50);

INSERT INTO alunos (nome, curso, nota)
VALUES
    ('Ana Souza', 'Sistemas de Informação', 9.00),
    ('João Lima', 'Engenharia Civil', 6.50),
    ('Carlos Mendes', 'Administração', 7.50);

SELECT * FROM alunos;

SELECT nome, curso
FROM alunos;

SELECT *
FROM alunos
WHERE nota >= 7;

SELECT *
FROM alunos
WHERE nome = 'Ana Souza';

UPDATE alunos
SET nota = 9.50
WHERE id = 1;

UPDATE alunos
SET curso = 'Ciência da Computação'
WHERE nome = 'João Lima';

DELETE FROM alunos
WHERE id = 3;

SELECT * FROM alunos;