drop database if exists nomeMeuSistema;
Create database nomeMeuSistema;
use nomeMeuSistema;

create table pessoa (
                        id INT auto_increment primary key,
                        nome varchar(50) not null
);
Select* FROM pessoa;