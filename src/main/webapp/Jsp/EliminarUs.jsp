<%--Holly--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Eliminar Usuario</title>
</head>
<body>
   <h1>Eliminar Usuario</h1>
    <form action="../SvEliminarUs" method="post">
      <label for="id_usuarioN">Usuario nombre: </label>
      <input type="text" id="id_usuarioN" name="id_usuarioN" required>
      <br>
      <input type="submit" value="Eliminar">
    </form>
</body>
</html>
