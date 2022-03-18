<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>OnlineStore-Administration</title>
</head>
<body>
<h1><%= "OnlineStore - Administration" %>
</h1><br/>

<%
    String login = (String) session.getAttribute("login");
    if (login != null) {%>
        <%-- Syntaxe sans JSP EL
        Bonjour <%=login%> ( <a href="logout"> Déconnexion</a>)<br/>

        Syntaxe avec JSP EL --%>
        Bonjour ${login} ( <a href="logout"> Déconnexion</a>)<br/>

<%
    }
%>

<a href="login.html">Login</a><br/>
<a href="createCatalogue">Affichage du catalogue</a><br/>
<a href="add-work-form.html">Ajouter une oeuvre</a>

</body>
</html>