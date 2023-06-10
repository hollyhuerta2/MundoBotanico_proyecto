<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Agregar Zona</title>
</head>
<body>
        <h1>Agregar zona de plantas</h1>
        <form action="../SvAgregarZona" method="post">

            <label for="id_zona">id_zona: </label>
            <input type="number" name="id_zona" id="id_zona" required>
            <br>
            <label for="zona">zona planta: </label>
            <input type="text" name="zona" id="zona" required>
            <br>
            <label for="area_geo">area geográfica: </label>
            <input type="text" name="area_geo" id="area_geo" required>
            <br>
            <input type="submit" value="subir">
        </form>

</body>
</html>
