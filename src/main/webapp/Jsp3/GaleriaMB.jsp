<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Galeria</title>
    <link rel="stylesheet" href="./css/estilo2.css"/>
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
        }
        .header-content h4{
            text-align: center;
            color: #bbd5bd;
        }
        header {
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
        h2{
            text-align: center;
            color: #ffffff;
        }
        p{
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
        <h1>Galería de imágenes</h1>
    </div>
</header>

<section>
    <div class="row">
        <div class="column">
            <img alt="foto 1" src="./img2/imagen1.jpg"/>
            <img alt="foto 2" src="./img2/imagen2.jpg"/>
            <img alt="foto 3" src="./img2/imagen3.jpg"/>
            <img alt="foto 4" src="./img2/imagen4.jpg"/>
            <img alt="foto 5" src="./img2/imagen5.jpg"/>
        </div>
        <div class="column">
            <img alt="foto 6" src="./img2/imagen6.jpg"/>
            <img alt="foto 7" src="./img2/imagen7.jpg"/>
            <img alt="foto 8" src="./img2/imagen8.jpg"/>
            <img alt="foto 9" src="./img2/imagen9.jpg"/>
            <img alt="foto 10" src="./img2/imagen10.jpg"/>
        </div>
        <div class="column">
            <img alt="foto 11" src="./img2/imagen11.jpg"/>
            <img alt="foto 12" src="./img2/imagen12.jpg"/>
            <img alt="foto 13" src="./img2/imagen13.jpg"/>
            <img alt="foto 14" src="./img2/imagen14.jpg"/>
            <img alt="foto 15" src="./img2/imagen15.jpg"/>
        </div>
        <div class="column">
            <img alt="foto 16" src="./img2/imagen16.jpg"/>
            <img alt="foto 17" src="./img2/imagen17.jpg"/>
            <img alt="foto 18" src="./img2/imagen18.jpg"/>
            <img alt="foto 19" src="./img2/imagen19.jpg"/>
            <img alt="foto 20" src="./img2/imagen20.jpg"/>
        </div>

    </div>
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
