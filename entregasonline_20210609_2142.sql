


/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [id]
      ,[nome]
      ,[email]
      ,[telefone]
	  -- delete 
  FROM [dbPedidos].[dbo].[cliente] 
--  where email = 'vanessa@terra.com';



  -- insert into [cliente] (nome,email,telefone) values('jose','jose@teste.com','1194749-9111');

/*** Cliente
  
CREATE TABLE Cliente (
	id [int] IDENTITY(1,1) NOT NULL,
	nome VARCHAR(60) NOT NULL,
	email VARCHAR(255) NOT NULL,
	telefone VARCHAR(20) NOT NULL,

	primary key (id)
);  
  
  
*/


/*** Entrega

drop TABLE Entrega  

CREATE TABLE Entrega (
	id [int] IDENTITY(1,1) NOT NULL,
	Cliente_id int not null,
	taxa decimal(10,2) not null,
	status varchar(20) not null,
	data_pedido datetime not null,
	data_finalizacao datetime,

	destinatario_nome varchar(60),
	destinatario_logradouro varchar(255),
	destinatario_numero varchar(30),
	destinatario_complemento varchar(60),
	destinatario_bairro varchar(30),

	primary key (id)
);  
  

alter table entrega add constraint fk_entrega_cliente foreign key (cliente_id) references Cliente;

select * from Entrega;
  
*/


-- https://howtodoinjava.com/jpa-tutorials-and-examples/
-- https://howtodoinjava.com/jdbc-tutorials/
-- https://howtodoinjava.com/jpa/configure-jpa-without-persistence-xml/


-- https://www.codejava.net/frameworks/spring-boot/connect-to-microsoft-sql-server-examples
-- https://flywaydb.org/documentation/usage/maven/migrate
-- https://jakarta.ee/specifications/persistence/
-- https://www.w3resource.com/sql/sql-basic/create-schema.php
-- https://www.alura.com.br/artigos/como-utilizar-os-comandos-insert-select-update-e-delete-em-sql?gclid=Cj0KCQjwzYGGBhCTARIsAHdMTQxTLlcePUZZg5pMHKKaGNOfTRetzwa7KbKrYj1QsmLohcH_SeG3nFAaAviuEALw_wcB
-- https://cursos.alura.com.br/forum/topico-configurar-application-properties-com-outro-banco-de-dados-140601


-- https://docs.microsoft.com/pt-br/azure/developer/java/spring-framework/configure-spring-data-jpa-with-azure-sql-server

-- Vídeo Aula - SQL Server - Criar Login e Usuário de banco de dados
-- https://www.youtube.com/watch?v=FVUEC_XVM5Y
-- https://docs.microsoft.com/pt-br/sql/relational-databases/errors-events/mssqlserver-233-database-engine-error?view=sql-server-ver15
-- https://docs.microsoft.com/pt-br/sql/database-engine/configure-windows/enable-or-disable-a-server-network-protocol?view=sql-server-ver15


