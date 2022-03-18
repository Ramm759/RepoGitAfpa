<%--
  Created by IntelliJ IDEA.
  User: Fred
  Date: 18/03/2022
  Time: 08:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action=main-servlet>

    <h1>Choisissez une figure géométrique</h1><br/>
    <input type="radio" name= "figure" value="carre" >Carré<br/>
    <input type="radio" name= "figure" value="rectangle">Rectangle<br/>
    <input type="radio" name= "figure" value="cercle">Cercle<br/><br/>

    Côté : <input type="text" name="cote"/>    Longueur : <input type="text" name="longueur"/>
    Largeur : <input type="text" name="largeur"/>    Base : <input type="text" name="base"/>
    Hauteur : <input type="text" name="hauteur"/><br/><br/>

    <input type="hidden" name="operationEffectuee" value="ask-figure">
    <input type="submit" value="Valider">

</form>
</body>
</html>
