<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.CuidadoPlan"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Cuidados de Plantas</title>
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
        tr:hover {background-color: #235411;}
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
        section {
            background-color: #42963d;
            margin: 10px;
            padding: 20px;
            border-radius: 10px;
            text-align: center;

        }
        footer{
            background-color: #376236;
            margin: 5px;
            padding: 10px;
            border-radius: 10px;
            text-align: center;
        }
        .button-container {
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
            background-color: #193d0c;
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
    </style>
</head>
<body>
<header>
    <div class="header-content">

        <div class="imagen-redonda">
            <img src="./imagen/MundoBotanico.png" alt="logo">
        </div>
        <h1>¡Bienvenido a Mundo Botánico!</h1>
    </div>
</header>
<section>
    <h1>Cuidados de plantas</h1>
    <table>
        <tr>
            <th>id_cuidado</th>
            <th>Tipo</th>
            <th>descripcion</th>
        </tr>
        <%
            List<CuidadoPlan> cuidadoPlans =(List<CuidadoPlan>) request.getAttribute("cuidados");
            if(cuidadoPlans!=null){
                for(CuidadoPlan cuidados:cuidadoPlans){

        %>
        <tr>
            <td><%=cuidados.getId_cuidado() %></td>
            <td><%=cuidados.getTipofk() %></td>
            <td><%=cuidados.getDescripcion()%></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</section>
<footer>
    <div class="button-container">
        <button onclick="redirectToServlet()" class="button">Salir</button>
    </div>
</footer>
<script type="text/javascript">
    function redirectToServlet() {
        location.href = "./SvRegreso"; /*al fin me salió*/
    }
</script>

</body>
</html>
