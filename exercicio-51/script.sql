DROP DATABASE IF EXISTS bancoTeste01;
CREATE DATABASE bancoTeste01;
USE bancoTeste01;

DROP TABLE IF EXISTS pessoa;

CREATE TABLE pessoa (
                        id DECIMAL(10,0) PRIMARY KEY,
                        nome VARCHAR(50),
                        endereco VARCHAR(100)
);

INSERT INTO pessoa (id, nome, endereco)
VALUES
    (123, 'André Silva', 'Av. Brasil, 100'),
    (234, 'João Bezerra', 'Av. João Naves, 300'),
    (345, 'Maria Bonita', 'Av. Tiradentes, 400'),
    (456, 'Joana Darc', 'Rua Principal, 200');

SELECT * FROM pessoa;