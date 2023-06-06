<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
    <style>
        body{
            background-color: indianred; /*color fondo*/
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
<h1>¡Ups! El servidor no está disponible</h1>
<p>Lo sentimos, el servidor no se encuentra disponible en este momento.</p>
<button onclick="redirectToIndex()">Ir a la página de inicio</button>
</div>

<script type="text/javascript">
    function redirectToIndex() {
        location.href = "index.jsp";
    }
</script>
</body>
</html>

