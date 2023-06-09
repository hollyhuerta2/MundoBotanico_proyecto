<%--
  holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Buscar Usuario</title>
</head>
<body>
     <h1>Buscar Usuario</h1>
      <form action="../SvModificarUs" method="get">
      <label for="id_usuarioN">Nombre usuario: </label>
      <input type="text" name="id_usuarioN" id="id_usuarioN" required>
      <br>
      <input type="submit" value="Buscar">
      </form>
</body>
</html>
