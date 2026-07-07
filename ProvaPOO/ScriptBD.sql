drop database if exists ProvaCRUD;
create database ProvaCRUD;
USE ProvaCRUD;

create table laboratorio(
	id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOt NULL,
    capacidade int,
    responsavel varchar(50)
);