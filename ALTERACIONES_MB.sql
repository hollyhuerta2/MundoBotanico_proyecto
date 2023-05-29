--alteraciones en la tablas 
ALTER TABLE USUARIO
ADD COLUMN id_usuarioN varchar(30);

UPDATE USUARIO
SET id_usuarioN = 'Admin'
WHERE id_usuario= 1;

select*from USUARIO;

UPDATE USUARIO
SET id_usuarioN = 'Jenncruz'
WHERE id_usuario= 4;

UPDATE USUARIO
SET id_usuarioN = 'JesusLr'
WHERE id_usuario= 2;

UPDATE USUARIO
SET id_usuarioN = 'Mary71'
WHERE id_usuario= 3;

DROP TABLE planta_us
create table PLANTA_US(
	id_planus int primary key,
	usuariofk int,
	plantasfk int,
	FOREIGN KEY (usuariofk)REFERENCES USUARIO(id_usuario)ON DELETE CASCADE,
	FOREIGN KEY (plantasfk)REFERENCES PLANTAS(id_planta)ON DELETE CASCADE
);
--llenado tabla plantas usuarios
insert into PLANTA_US values (1,1,5),(2,2,9),(3,3,8),(4,4,3);

insert into PLANTA_US values(5,6,1);


DELETE FROM usuario where id_usuario = 6;










