


DROP TABLE IF EXISTS AGENCIA;

CREATE TABLE AGENCIA(
	id int auto_increment primary key,
	nome varchar(50) not null,
	endereco varchar(100) not null,
	estah_aberta int not null
);


INSERT INTO AGENCIA(nome, endereco, estah_aberta) VALUES('Agencia Vix', 'Av.Vitoria', 1);
INSERT INTO AGENCIA(nome, endereco, estah_aberta) VALUES('Agencia Serra', 'Av.Central, n° 47', 1);
INSERT INTO AGENCIA(nome, endereco, estah_aberta) VALUES('Agencia Vila Velha', 'Av.Carioca, n°879', 1);
INSERT INTO AGENCIA(nome, endereco, estah_aberta) VALUES('Agencia Cariacica', 'Av.Expedido Garcia, n°1504', 1);
INSERT INTO AGENCIA(nome, endereco, estah_aberta) VALUES('Agencia Viana', 'Av.Marcilio, n° 407', 1);

