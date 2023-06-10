<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Agregar Tipo planta</title>
</head>
<body>
        <h1>Agregar tipo planta</h1>
        <form action="../SvAgregarTipoP" method="post">

          <label for="id_tipo">id_tipo: </label>
          <input type="number" name="id_tipo" id="id_tipo" required>
          <br>
          <label for="tipo">tipo planta: </label>
          <input type="text" name="tipo" id="tipo" required>
          <br>
          <label for="descripcion">descripcion: </label>
          <input type="text" name="descripcion" id="descripcion" required>
          <br>
          <input type="submit" value="subir">
        </form>

</body>
</html>
