<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Accueil</title>
</head>
<body>
<form action=main-servlet>
  <h1>Quelle opération souhaitez vous effectuer ?</h1><br/>
  <input type="radio" name= "operation" value="surface" >Calculer la surface<br/>
  <input type="radio" name= "operation" value="perimeter">Calculer le périmètre<br/>
  <input type="radio" name= "operation" value="hypotenuse">Calculer l'hypoténuse<br/>

  <h1>Choisissez une figure géométrique</h1><br/>
  <input type="radio" name= "figure" value="carre" >Carré<br/>
  <input type="radio" name= "figure" value="rectangle">Rectangle<br/>
  <input type="radio" name= "figure" value="cercle">Cercle<br/><br/>

  Côté : <input type="text" name="cote"/>    Longueur : <input type="text" name="longueur"/>
  Largeur : <input type="text" name="largeur"/>    Base : <input type="text" name="base"/>
  Hauteur : <input type="text" name="hauteur"/><br/><br/>

  <input type=submit value=Valider>

</form>
</body>
</html>