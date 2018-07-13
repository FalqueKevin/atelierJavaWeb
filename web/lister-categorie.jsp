<%-- 
    Document   : lister-categorie
    Created on : 9 juil. 2018, 16:28:49
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des Categories</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div id="supercontainer">
            <div id="container">
                <div id="contenu">
                    <header>
                        <span></span> <h1>Liste des Categories</h1> <span></span>
                    </header>
                    <a href="<c:url value="/ajouter-categorie"/>">Ajouter une catégorie</a>
                    <ul>
                        <c:forEach items="${listeCat}" var="catActuelle">
                            <li>${catActuelle.nom}      <a href="<c:url value="/supprimer-categorie"/>?idCat=${catActuelle.id}">Supprimer</a></li> 
                        </c:forEach>
                    </ul>
                    <a href="<c:url value="/ajouter-categorie"/>">Ajouter une catégorie</a><br>
                </div>
            </div>
        </div>    
    </body>
</html>
