<%@ page import="modelo.Zona" %><%--@elvariable id="zona" type="modelo.Zona"--%>
<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Modificar Zona</title>
    <style>
        body{
            background-color: #70163c;
        }
        .form-container {
            width: 300px;
            margin: 0 auto;
        }
        .form-container input[type="text"],
        .form-container input[type="number"]{
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        .form-container input[type="submit"] {
            width: 60%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #70163c;
            color: white;
            cursor: pointer;
        }

        .form-container input[type="submit"]:hover {
            background-color: #c95e8b;
        }
        h1 {
            text-align: center;
            color: #ffffff;
            font-family: Verdana, serif;
        }
        #cuadro{
            width: 330px;
            background: #d53e7d;
            color: aliceblue;
            margin: auto;
            margin-top: 120px;
            padding: 5px 5px 30px 5px;
            border-top: 35px solid #d53e7d;
            border-right: 50px solid #d53e7d;
            border-left: 35px solid #d53e7d;
            border-radius: 6px;
        }
    </style>
</head>
<body>
<div id="cuadro">
        <h1>Modificar Zona</h1>
    <div class="form-container">
        <form action="../SvModificarZona" method="post">
            <label for="id_zona">id_zona: </label>
            <input type="number" name="id_zona" id="id_zona" required>
            <br>
            <label for="zona">Zona: </label>
            <input type="text" name="zona" id="zona" required>
            <br>
            <label for="area_geo">Area geográfica: </label>
            <input type="text" name="area_geo" id="area_geo" required>
            <br>
            <input type="submit" value="Actualizar">
        </form>
    </div>
</div>

</body>
</html>
