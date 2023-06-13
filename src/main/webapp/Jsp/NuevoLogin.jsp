<%--
  Created by IntelliJ IDEA.
  User: holly
  Date: 13/06/2023
  Time: 03:31 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nuevo Usuario</title>
</head>
<body>
<form action="../ServletNuevoUS" method="post">
    <label for="id_usuario">id_usuario: </label>
    <input type="number" name="id_usuario" id="id_usuario" placeholder="Un número.." required>
    <br>
    <label for="nombre">nombre: </label>
    <input type="text" name="nombre" id="nombre" placeholder="Un nombre.." required>
    <br>
    <label for="apellido">apellido: </label>
    <input type="text" name="apellido" id="apellido" placeholder="Un apellido.." required>
    <br>
    <label for="correo">correo: </label>
    <input type="text" name="correo" id="correo" placeholder="Un correo.." required>
    <br>
    <label for="id_usuarioN">nombre usuario: </label>
    <input type="text" name="id_usuarioN" id="id_usuarioN" placeholder="Un nombre random.." required>
    <br>
    <br>
    <input type="submit" value="registrarse">
</form>

</body>
</html>
