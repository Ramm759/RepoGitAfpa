<%--
  Created by IntelliJ IDEA.
  User: Fred
  Date: 17/03/2022
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>details</title>
</head>
<body>
    <h1 style = 'color:red' >Descriptif de l'oeuvre </h1>
    Titre : ${work.title}<br/>
    Année de parution : ${work.release}<br/>
    Genre : ${work.genre}<br/>
    Artiste principal : ${work.mainArtist.name}<br/>
    Résumé : ${work.summary}<br/>

    <form action=addToCart method="post">
        <input type=hidden name=identifiant value = "${work.id}"/><br/><br/>
        <input type=submit value=Ajouter au caddie>



</body>
</html>
