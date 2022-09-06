use zarparbahia
create table cliente (
 idcadastro int identity primary key,
 nome varchar(40),
 nascimento Date,
 cpf varchar(30),
 cep varchar(8),
 celular varchar (9),
 email varchar (40),
 senha  varchar(20),
 CONSTRAINT fk_id_cliente FOREIGN KEY (idcadastro) REFERENCES cliente (idcadastro)
);
create table ZarparBahia_Login(
identrar int  identity primary key,
CONSTRAINT fk_id_ZarparBahia_Login FOREIGN KEY (identrar) REFERENCES cliente (idcadastro)
);


create table pacotedeviagem(
 Idviagem int identity primary key,
 Nomepacote varchar(40),
 Valordopacote Decimal,
 Datainicio date,
 Origem varchar(40),
 Destino varchar (40),
 Pagamento varchar (40),

 CONSTRAINT fk_id_pacotedeviagem FOREIGN KEY (Idviagem) REFERENCES pacotedeviagem(idviagem)
 );

