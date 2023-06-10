<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Plantas</title>
</head>
<body>
        <h1>Registrar nueva planta</h1>
        <form action="../SvAgregarPlantas" method="post">
            <label for="id_planta">id_planta: </label>
            <input type="number" name="id_planta" id="id_planta" required>
            <br>
            <label for="nombre_com">nombre común: </label>
            <input type="text" name="nombre_com" id="nombre_com" required>
            <br>
            <label for="nombre_cient">nombre científico: </label>
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
            <input type="submit" value="subir">
        </form>

</body>
</html>
