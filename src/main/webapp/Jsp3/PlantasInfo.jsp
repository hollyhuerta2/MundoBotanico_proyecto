<%--
  Created by IntelliJ IDEA.
  User: holly
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>PLANTAS</title>
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
        nav{
            display: flex;
            flex-direction: row;
            background-color: #306b19;
        }
        h2{
            text-align: center;
            color: #ffffff;
        }
        p{
            color: #000000;
            font-family: "Comic Sans MS";
            font-size: 20px;
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
        h3{
            color: darkmagenta;
        }
    </style>
</head>
<body>
<header>
    <div class="header-content">

        <div class="imagen-redonda">
            <img src="./imagen/MundoBotanico.png" alt="logo">
        </div>
        <h1>Conoce más sobre las plantas</h1>
    </div>
</header>
<section>
    <h2>Esto es lo que debes de conocer sobre ellas</h2>
    <h3>ROSAS:</h3>
    <p>La rosa es una flor perteneciente a la familia de las Rosáceas que tiene gran popularidad en todo el mundo. </p>
    <p>Si bien la planta recibe el nombre de "rosal", la denominación "rosa" ha pasado a ser el nombre común de todas las flores de esta familia, </p>
    <p>las cuales bordean las 30 mil variedades.</p>
         <br>
    <h3>GIRASOLES:</h3>
    <p>El girasol recibe este nombre gracias a las propiedades que posee esta planta cuando es joven
    <p> y que le permiten girar en dirección de los rayos del Sol (heliotropismo),</p>
    <p> y de esta manera aprovechar de sus virtudes.</p>
         <br>
    <h3>PETUNIAS: </h3>
    <p>Las petunias son plantas anuales que destacan por la viveza de los colores de sus flores. </p>
    <p>  Sus esponjosas hojas verdes hacen que sus tonos tengan aún más presencia.</p>
    <p> La variedad cromática es muy signifitcativa, desde el blanco hasta los más intensos azules o púrpuras; incluso,</p>
    <p> también hay bicolores en degradado o rayadas. </p>
         <br>
    <h3>MARGARITAS:</h3>
    <p> La margarita es una de las flores más populares y queridas en todo el mundo. Conocida por su belleza y simplicidad,</p>
    <p>la margarita es una flor icónica que se ha convertido en un símbolo de amor, amistad y alegría.</p>
         <br>
    <h3>TULIPANES:</h3>
    <p>Los tulipanes son plantas florales que, gracias a su belleza y elegancia,</p>
    <p>se han convertido en un regalo simplemente perfecto.</p>
    <p>Los tulipanes además de ser decorativos tienen varias propiedades medicinales. Entre ellas se conoce su efecto como laxante y como analgésico.</p>
    <p>De hecho, el tulipán es parte de los ingredientes de remedios naturales con distintos efectos.</p>
         <br>
    <h3>CLAVELES:</h3>
    <p>Simbolizan la belleza y a la fascinación aunque dependiendo de su color el significado puede variar.</p>
    <p>Es una flor muy versátil. Dependiendo de la cultura en la que nos encontremos,</p>
    <p>los claveles rojos pueden utilizarse en ocasiones felices o tristes y vincularse con la muerte y el consuelo.</p>
         <br>
    <h3>LIRIOS:</h3>
    <p>Los lirios son flores mejor conocidas, en algunos casos, como azucenas. Esta hermosa flor que nace desde un bulbo, que tiene hermosos colores brillantes,</p>
    <p>que van desde los lisos, pasando por los mateados y rallados, </p>
    <p>con un olor espectacular y una hermosa magnificencia, basta para adornar cualquier espacio de la casa.</p>
    <p>La flor de los dioses, en especial de Horus, el dios de la civilización de acuerdo a las mitologías egipcias, el lirio no era una flor para cualquiera.</p>
    <p>Pues era reservada solo para decorar los palacios y sarcófagos de los faraones.</p>
         <br>
    <h3>ORQUÍDEAS:</h3>
    <p>Las orquídeas se encuentran entre las plantas más prehistóricas del planeta, con especies como la Liparis sp.</p>
    <p>(Orquídea de Borneo) que se calcula habita nuestro planeta desde hace unos 80 millones de años.</p>



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
