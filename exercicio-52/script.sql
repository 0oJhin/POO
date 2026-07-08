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

-- 1.
DELETE FROM pessoa
WHERE id = 234;

SELECT * FROM pessoa;

-- 2.
DELETE FROM pessoa;

SELECT * FROM pessoa;

--3.
Remove os registros de uma tabela.
A tabela continua existindo.
Sua estrutura (colunas e tipos) é mantida.
--4.
DELETE FROM pessoa
WHERE nome = 'Maria Bonita';

SELECT * FROM pessoa;
--5.

Connection
É a interface responsável por estabelecer a conexão entre a aplicação Java e o banco de dados MySQL.
Statement
É a interface utilizada para enviar comandos SQL ao banco de dados.
executeUpdate()
É o método utilizado para executar comandos que alteram os dados do banco, como INSERT, UPDATE, DELETE e CREATE TABLE. Ele retorna a quantidade de registros afetados.
DELETE FROM
É o comando SQL utilizado para remover registros de uma tabela. Geralmente é utilizado junto com a cláusula WHERE para excluir apenas os registros desejados.
Como esses elementos trabalham juntos?
Primeiro, a Connection estabelece a conexão com o banco de dados. Em seguida, a Statement envia o comando SQL. O método executeUpdate() executa o comando DELETE FROM, removendo o registro especificado da tabela.
--6.
A cláusula WHERE permite selecionar exatamente quais registros serão removidos.
Sem ela, o comando DELETE excluirá todos os registros da tabela, podendo causar perda de dados.
Por isso, utilizar WHERE aumenta a segurança e evita exclusões acidentais.
exemplo seguro:
DELETE FROM pessoa
WHERE id = 123;
exemplo perigoso:
DELETE FROM pessoa;