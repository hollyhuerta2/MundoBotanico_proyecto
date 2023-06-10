<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="modelo.Planta_Us"%>
<%@ page import ="java.io.*, java.util.*"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Plantas-Usuarios</title>
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
  </style>
</head>
<body>
<header>
  <div class="imagen-redonda">
    <img src="./imagen/cinnaicon.jpg" alt="logo">
  </div>
</header>
<h1>Tabla de Plantas de Usuarios</h1>
      <div class="button-container">
       <a href="./Jsp2/AgregarPlanus.jsp" class="button">REGISTRAR</a>
       <a href="./Jsp2/ModPlanus.jsp" class="button">MODIFICAR</a>
  </div>
      <table>
        <tr>
           <th>id_planus</th>
           <th>Usuario</th>
           <th>plantas</th>
        </tr>
         <%
             List<Planta_Us> plantaUses =(List<Planta_Us>) request.getAttribute("UsPlan");
                 if(plantaUses!=null){
                    for(Planta_Us plan:plantaUses){

         %>
           <tr>
               <td><%=plan.getId_planus() %></td>
               <td><%=plan.getUsuariofk() %></td>
                <td><%=plan.getPlantasfk()%></td>
           </tr>
       <%
                   }
               }
       %>
</table>

</body>
</html>
