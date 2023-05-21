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
















