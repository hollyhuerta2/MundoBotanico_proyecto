
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenido, Usuario</title>
</head>
<body>
    <h1>Bienvenido,<%=request.getAttribute("nombre usuario")%>!</h1>
    <p>tienes acceso a nivel usuario</p>
</body>
</html>
