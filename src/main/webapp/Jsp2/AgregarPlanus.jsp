<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar usuario-planta</title>
</head>
<body>
<h1>Registrar nuevo usuario-planta</h1>

<form action="../SvAgregarPlanus" method="post">

    <label for="id_planus">id_planus: </label>
    <input type="number" name="id_planus" id="id_planus" required>
    <br>
    <label for="usuariofk">usuariofk: </label>
    <input type="number" name="usuariofk" id="usuariofk" required>
    <br>
    <label for="plantasfk">plantasfk: </label>
    <input type="number" name="plantasfk" id="plantasfk" required>
    <br>
    <input type="submit" value="subir">
</form>
</body>
</html>
