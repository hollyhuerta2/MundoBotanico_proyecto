<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.Plantas"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Plantas</title>
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
    <h1>Tabla Plantas</h1>
    <div class="button-container">
         <a href="./Jsp2/AgPlantas.jsp" class="button">REGISTRAR</a>
         <%--<a href="./Jsp/EliminarUs.jsp" class="button">ELIMINAR</a>--%>
         <a href="./Jsp2/ModPlantas.jsp" class="button">MODIFICAR</a>
    </div>

   <table>
       <tr>
           <th>id_planta</th>
           <th>nombre_com</th>
           <th>nombre_cient</th>
           <th>tipofk</th>
           <th>tipohojafk</th>
           <th>zonafk</th>
           <th>familiafk</th>
       </tr>
       <%
           List<Plantas> plantas = (List<Plantas>) request.getAttribute("plantas");
           if(plantas!=null){
               for(Plantas plantas1:plantas){
       %>
       <tr>
           <td><%=plantas1.getId_planta() %></td>
           <td><%=plantas1.getNombre_com() %></td>
           <td><%=plantas1.getNombre_cient()%></td>
           <td><%=plantas1.getTipofk() %></td>
           <td><%=plantas1.getTipohojafk() %></td>
           <td><%=plantas1.getZonafk() %></td>
           <td><%=plantas1.getFamiliafk() %></td>
       </tr>
       <%
               }
           }
       %>
   </table>

</body>
</html>
