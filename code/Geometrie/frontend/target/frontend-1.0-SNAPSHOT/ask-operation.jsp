<%--
  Created by IntelliJ IDEA.
  User: Fred
  Date: 17/03/2022
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action=main-servlet>
    <h1>Quelle opération souhaitez vous effectuer ?</h1><br/>
    <input type="radio" name= "operation" value="surface" >Calculer la surface<br/>
    <input type="radio" name= "operation" value="perimetre">Calculer le périmètre<br/>
    <input type="radio" name= "operation" value="hypotenuse">Calculer l'hypoténuse<br/>
    <input type="hidden" name="operationEffectuee" value="ask-operation">
    <input type="submit" value="Valider">
</form>
</body>
</html>
