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
                <form class="contenu" method="POST">
                    <div>
                        <span></span>
                        <h3>Inscription</h3>
                        <span></span>
                    </div>
                    <section>
                        <input type="text" name="nom" placeholder="Nom">
                    </section><br>
                    <section>
                        <input type="text" name="prenom" placeholder="Prénom">
                    </section><br>
                    <section>
                        <input type="text" name="login" placeholder="Pseudonyme">
                    </section><br>
                    <section>
                        <input type="password" name="mdp" placeholder="Mot de passe">
                    </section><br>
                    <section>
                        <input type="text" name="numero" placeholder="Numéro">
                    </section><br>
                    <section>
                        <input type="text" name="rue" placeholder="Nom de la voie">
                    </section><br>
                    <section>
                        <input type="text" name="codePostal" placeholder="Code Postal">
                    </section><br>
                    <section>
                        <input type="text" name="ville" placeholder="Ville">
                    </section><br>
                    <div>
                        <button type="submit">S'inscrire</button> 
                    </div><br>
                </form>
            </div>
            <c:import url="_PIED.jsp"/>
            <c:import url="_JAVASCRIPT.jsp"/>
        </div>
    </body>
</html>