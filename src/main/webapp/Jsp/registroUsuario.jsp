
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registrar usuario</title>
</head>
<body>
    <h1>Registrar usuario</h1>

    <form action="SVRegistroU" method="post">
        <label for="id_usuario">id_usuario: </label>
        <input type="number" name="id_usuario" id="id_usuario" required>
        <br>
        <label for="nombre">nombre: </label>
        <input type="text" name="nombre" id="nombre" required>
        <br>
        <label for="apellido">apellido: </label>
        <input type="text" name="apellido" id="apellido" required>
        <br>
        <label for="correo">correo: </label>
        <input type="text" name="correo" id="correo" required>
        <br>
        <label for="id_usuarioN">nombre usuario: </label>
        <input type="text" name="id_usuarioN" id="id_usuarioN" required>
        <br>
        <input type="submit" value="subir">

    </form>

</body>
</html>
