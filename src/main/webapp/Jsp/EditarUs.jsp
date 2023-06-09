<%@ page import="modelo.Usuario" %><%--@elvariable id="usuario" type="modelo.Usuario"--%>
<%--
holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Editar Usuario</title>
</head>
<body>
    <h1>Modificar usuario</h1>
    <form action="SvModificarUs" method="post">
      <label for="id_usuarioN">Nombre usuario: </label>
      <input type="text" name="id_usuarioN" id="id_usuarioN" value="<%=((Usuario)request.getAttribute("usuario")).getId_usuarioN()%>" required>
      <br>
      <label for="id_usuario">id_usuario: </label>
      <input type="number" name="id_usuario" id="id_usuario" value="<%=((Usuario)request.getAttribute("usuario")).getId_usuario()%>" required readonly>
      <br>
      <label for="nombre">Nombre: </label>
      <input type="text" name="nombre" id="nombre" value="<%= ((Usuario)request.getAttribute("usuario")).getNombre()%>" required>
      <br>
      <label for="apellido">Nombre: </label>
      <input type="text" name="apellido" id="apellido" value="<%= ((Usuario)request.getAttribute("usuario")).getApellido()%>" required>
      <br>
      <label for="correo">Nombre: </label>
      <input type="text" name="correo" id="correo" value="<%= ((Usuario)request.getAttribute("usuario")).getCorreo()%>" required>
      <br>
      <input type="submit" value="Actualizar">

    </form>

</body>
</html>
