<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Agregar familias</title>
</head>
<body>
        <h1>Agregar familias de plantas</h1>
        <form action="../SvAgregarFam" method="post">

          <label for="id_fam">id_fam: </label>
          <input type="number" name="id_fam" id="id_fam" required>
          <br>
          <label for="nombre">nombre familia: </label>
          <input type="text" name="nombre" id="nombre" required>
          <br>
          <label for="descripcion">plantasfk: </label>
          <input type="text" name="descripcion" id="descripcion" required>
          <br>
          <input type="submit" value="subir">
        </form>

</body>
</html>
