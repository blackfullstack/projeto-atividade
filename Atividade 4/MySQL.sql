
create database  zarparbahia
use zarparbahia
create  table contato (
 idcadastro int not null auto_increment primary key,
 nome varchar(40),
 nascimento varchar(10),
 cpf varchar(30),
 cep varchar(9),
 celular varchar (9),
 email varchar (40),
 senha  varchar(20)
);

create table ZarparBahia_Login(
identrar int  not null auto_increment primary key
);

create table pacotedeviagem(
 Idviagem int not null auto_increment primary key,
 Nomepacote varchar (40),
 Valordopacote  varchar(20),
 Datainicio date ,
 Origem  varchar (30),
 Destino  varchar (30),
 Pagamento varchar(20)

 );




