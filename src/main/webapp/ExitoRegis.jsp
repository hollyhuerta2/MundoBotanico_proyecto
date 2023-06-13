<%--
  Created by IntelliJ IDEA.
  User: holly
  Date: 13/06/2023
  Time: 03:58 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exito registro</title>
    <style>
        body{
            background-color: #235411; /*color fondo*/
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
<div class ="container">
    <h1>¡Registro Exitoso !</h1>
    <h2>Bienvenido nuevo usuario</h2>
    <img src="./imagen/Wandafeliz.gif" alt="Gif-Wanda">
    <p>para iniciar sesión dirigete al siguiente botón</p>
    <button onclick="redirectToServlet()">iniciar sesión</button>
</div>
<script type="text/javascript">
    function redirectToServlet() {
        location.href = "./ServletNuevoUS"; /*al fin me salió*/
    }
</script>

</body>
</html>
