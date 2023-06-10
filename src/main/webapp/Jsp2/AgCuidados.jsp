<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar cuidados</title>
</head>
<body>
    <h1>Agregar cuidados de plantas</h1>
    <form action="../SvAgregarCuidado" method="post">

        <label for="id_cuidado">id_cuidado: </label>
        <input type="number" name="id_cuidado" id="id_cuidado" required>
        <br>
        <label for="tipofk">tipofk: </label>
        <input type="number" name="tipofk" id="tipofk" required>
        <br>
        <label for="descripcion">plantasfk: </label>
        <input type="text" name="descripcion" id="descripcion" required>
        <br>
        <input type="submit" value="subir">
    </form>
</body>
</html>
