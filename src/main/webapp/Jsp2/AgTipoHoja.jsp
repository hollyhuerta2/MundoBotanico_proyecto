<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Agregar Tipo de Hoja</title>
</head>
<body>
    <h1>Agregar tipo de hojas</h1>
    <form action="../SvAgregarHoja" method="post">

      <label for="id_hoja">id_hoja: </label>
      <input type="number" name="id_hoja" id="id_hoja" required>
      <br>
      <label for="tipoh">tipoh: </label>
      <input type="text" name="tipoh" id="tipoh" required>
      <br>
      <label for="descripcion">descripcion: </label>
      <input type="text" name="descripcion" id="descripcion" required>
      <br>
      <input type="submit" value="subir">
    </form>

</body>
</html>
