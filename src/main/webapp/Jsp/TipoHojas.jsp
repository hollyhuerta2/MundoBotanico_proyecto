<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.TipoHoja"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Tipo de Hoja</title>
    <style>
        body {
            background-color: darkolivegreen;
        }
        table{
            table-layout: fixed;
            width: 100%;
            border-collapse: collapse;
            border: 3px solid #235411;
            margin: 15px 0;
            background-color: #5ed556;
        } .button-container {
              display: flex;
              justify-content: center;
              align-items: center;
              margin: 50px auto;
              max-width: 500px;
          }
        .button{
            margin: 20px;
            padding: 15px 25px;
            text-decoration: none;
            font-size: 18px;
            border-radius: 5px;
            color: white;
            background-color: #235411;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #895faf;
        }
        .button-container button {
            display: inline-block;
            margin: 5px;
            padding: 10px 20px;
            background-color: #333;
            color: #fff;
            width: 100%;
            text-align: center;
            transition: box-shadow 0.3s ease;
            border-radius: 5px;
            cursor: pointer;
        }
        thead th:nth-child(1) {
            width: 10%;
        }

        thead th:nth-child(2) {
            width: 20%;
        }

        thead th:nth-child(3) {
            width: 15%;
        }

        thead th:nth-child(4) {
            width: 35%;
        }

        th, td {
            border: 1px solid #235411;
            padding: 8px;
            text-align: left;
        }
        th{
            background-color: #235411;
        }
        tr:hover {background-color: #895faf;}
        .imagen-redonda{
            width: 90px;
            height: 90px;
            border-radius: 50%;
            overflow: hidden;
        }
        .imagen-redonda img{
            float: left;
            margin-right:10px;
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        header {
            margin: 0px;
            background-color: #235411;
            color: #fff;
            padding: 15px;
        }
        h1 {
            text-align: center;
            color: #bbd5bd;
            font-family: Verdana, serif;
        }
        .header-content{
            display: flex;
            align-items: center;
            justify-content: start;
            gap: 20px;
        }

        .header-content h1{
            text-align: center;
            color: #bbd5bd;
        }
    </style>
</head>
<body>
<header>
    <div class="header-content">
        <div class="imagen-redonda">
            <img src="./imagen/cinnaicon.jpg" alt="logo">
        </div>
        <h1>Administrador</h1>
    </div>
</header>
<h1>Tabla del Tipo de Hoja</h1>
  <div class="button-container">
       <a href="./Jsp2/AgTipoHoja.jsp" class="button">REGISTRAR</a>
<%--       <a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>--%>
       <a href="./Jsp2/ModHoja.jsp" class="button">MODIFICAR</a>
  </div>
<table>
    <tr>
        <th>id_hoja</th>
        <th>tipo hoja</th>
        <th>descripcion</th>
    </tr>
    <%
        List<TipoHoja> tipohoja =(List<TipoHoja>) request.getAttribute("hojas");
        if(tipohoja!=null){
            for(TipoHoja hojas:tipohoja){

    %>
    <tr>
        <td><%=hojas.getId_hoja() %></td>
        <td><%=hojas.getTipoh() %></td>
        <td><%=hojas.getDescripcion()%></td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
