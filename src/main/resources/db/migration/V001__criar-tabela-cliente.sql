CREATE TABLE clientes (
	id [int] IDENTITY(1,1) NOT NULL,
	nome VARCHAR(60) NOT NULL,
	email VARCHAR(255) NOT NULL,
	telefone VARCHAR(20) NOT NULL,

	primary key (id)
);