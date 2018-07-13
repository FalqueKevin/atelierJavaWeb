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
                        <span></span> <h3>Mon Compte</h3> <span></span>
                    </div>
                    <ul>
                        <li>Login : ${clientConnecte.login}</li>
                        <li>Nom : ${clientConnecte.nom}</li>
                        <li>prenom : ${clientConnecte.prenom}</li>
                        <li>Numéro de voie : ${clientConnecte.num}</li>
                        <li>Rue : ${clientConnecte.rue}</li>
                        <li>CodePostal : ${clientConnecte.codePostal}</li>
                        <li>Ville : ${clientConnecte.ville}</li>
                    </ul>
                    <a href="homepage">Retour</a>
                </div>
            </div>
            <c:import url="_PIED.jsp"/>
            <c:import url="_JAVASCRIPT.jsp"/>
        </div>
    </body>
</html>
