<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MA MAGNIFIQUE BOUTIQUE</title>
        <c:import url="_STYLESHEETS.jsp"/>
    </head>
    <body>
        <div id="container-fluid">
            <c:import url="_TITRE.jsp"/>
            <c:import url="_MENU.jsp"/>
            <div class="container">
                <div class="contenu">
                    <div>
                        <span></span> <h3>Liste des Clients</h3> <span></span>
                    </div>
                    <ul>
                        <c:forEach items="${listeClients}" var="clientActuel">
                            <li>${clientActuel.id} ${clientActuel.nom} ${clientActuel.prenom}</li>
                        </c:forEach>
                    </ul>
                    <a href="homepage">Retour</a>
                </div>
            </div>
            <c:import url="_PIED.jsp"/>
            <c:import url="_JAVASCRIPT.jsp"/>
        </div>
    </body>
</html>