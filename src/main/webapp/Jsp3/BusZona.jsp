<%@ page import="modelo.Zona" %><%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Zonas</title>
    <style>
        body {
            background-color: #5ed556;
        }
        .header-content{
            display: flex;
            align-items: center;
            justify-content: start;
            gap: 20px;
        }
        .header-content img{
            width: 50px;
            height: 50px;
        }
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
        .header-content h1{
            text-align: center;
            color: #bbd5bd;
        } header {
              background-color: #193d0c;
              color: #fff;
              padding: 15px;
        }
        section {
            background-color: #42963d;
            margin: 10px;
            padding: 20px;
            border-radius: 10px;
            text-align: center;

        }
        p{
            color: #ffffff;
        }
        nav{
            display: flex;
            flex-direction: row;
            background-color: #306b19;
        }
        label{
            color: #ffffff;
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
      <main>
          <nav>
          <form action="SvBusZona" method="get" accept-charset="UTF-8">
              <label for="zona">Zona:</label>
              <input type="text" id="zona" name="zona">
              <input type="submit" value="Buscar">

          </form>
          </nav>
        <section>
            <h1>Zonas</h1>
            <% Zona zona1 =(Zona)request.getAttribute("zona1");
                if(zona1!=null){%>
            <p>Zona: <%= zona1.getZona() %></p>
            <p>Area geo: <%= zona1.getArea_geo() %></p>
            <% } else { %>
            <p>No se encontró la zona.</p>
            <% } %>
        </section>
      </main>
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
