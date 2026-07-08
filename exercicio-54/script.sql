DROP DATABASE IF EXISTS nomeMeuSistema;
CREATE DATABASE nomeMeuSistema;
USE nomeMeuSistema;

CREATE TABLE pessoa (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL
);

SELECT * FROM pessoa;