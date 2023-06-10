
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head> <meta charset="UTF-8">
    <title>Éxito</title>
    <style>
        body{
            background-color: darkorchid; /*color fondo*/
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
    <h1>¡Página de éxito!</h1>
    <h2>Sale cada año bisiesto</h2>
    <img src="./imagen/Wandafeliz.gif" alt="Gif-Wanda">
    <p>para salir dirígete al botón siguiente</p>
    <button onclick="redirectToServlet()">Salir</button>
</div>

<script type="text/javascript">
    function redirectToServlet() {
        location.href = "./SvSesionLogin"; /*al fin me salió*/
    }
</script>

</body>
</html>
