<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Modificar plantas</title>
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
    <h1>Modificar Plantas</h1>
    <div class="form-container">
        <form action="../SvModificarPlantas" method="post">
            <label for="id_plantas">id_plantas: </label>
            <input type="number" name="id_plantas" id="id_plantas" required>
            <br>
            <label for="nombre_com">Nombre común: </label>
            <input type="text" name="nombre_com" id="nombre_com" required>
            <br>
            <label for="nombre_cient">Nombre científico: </label>
            <input type="text" name="nombre_cient" id="nombre_cient" required>
            <br>
            <label for="tipofk">tipofk: </label>
            <input type="number" name="tipofk" id="tipofk" required>
            <br>
            <label for="tipohojafk">tipohojafk: </label>
            <input type="number" name="tipohojafk" id="tipohojafk" required>
            <br>
            <label for="zonafk">zonafk: </label>
            <input type="number" name="zonafk" id="zonafk" required>
            <br>
            <label for="familiafk">familiafk: </label>
            <input type="number" name="familiafk" id="familiafk" required>
            <br>

            <input type="submit" value="Actualizar">
        </form>
    </div>
</div>

</body>
</html>