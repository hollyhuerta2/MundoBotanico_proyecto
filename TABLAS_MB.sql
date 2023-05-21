--base de datos Mundo botanico
--tablas para mi base de datos

--tabla para el usuario
create table USUARIO(
	id_usuario int primary key,
	nombre varchar(60) not null,
	apellido varchar(50) not null,
	correo varchar(80) not null
);

--tabla para la familia de plantas
create table FAMILIA(
	id_fam int primary key,
	nombre varchar(100) ,
	descripcion text
);

--tabla para la zona de las plantas ****
create table ZONA(
	id_zona int primary key,
	zona text,
	area_geo text
);

--tabla para el tipo de planta que es *******
create table TIPOPLANTA(
	id_tipo int primary key,
	tipo text,
	descripcion text
);

--crear una tabla para el tipo de hoja******
create table TIPOHOJA(
	id_hoja int primary key,
	tipoh text,
	descripcion text
);

--tabla para los cuidados
create table CUIDADOPLAN(
	id_cuidado int primary key,
	tipofk int,
	descripcion text,
	FOREIGN KEY (tipofk)REFERENCES TIPOPLANTA(id_tipo)
);


--tabla para las plantas como cátalogo******
create table PLANTAS(
	id_planta int primary key,
	nombre_com text,
	nombre_cient text,
	tipofk int,
	tipohojafk int,
	zonafk int,
	familiafk int,
	FOREIGN KEY (tipofk)REFERENCES TIPOPLANTA(id_tipo),
	FOREIGN KEY (zonafk)REFERENCES ZONA(id_zona),
	FOREIGN KEY (tipohojafk)REFERENCES TIPOHOJA(id_hoja),
	FOREIGN KEY (familiafk)REFERENCES FAMILIA(id_fam)
);

--tabla para la conexion de usuarios y plantas 
--para poder visualizar que plantas tiene el usuario
create table PLANTA_US(
	id_planus int primary key,
	usuariofk int,
	plantasfk int,
	FOREIGN KEY (usuariofk)REFERENCES USUARIO(id_usuario),
	FOREIGN KEY (plantasfk)REFERENCES PLANTAS(id_planta)
);














