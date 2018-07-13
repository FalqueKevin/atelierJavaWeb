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
                        <h3>Login</h3>
                        <span></span>
                    </div>
                    <section>
                        <input type="text" name="login" placeholder="Login">
                    </section><br>
                    <section>
                        <input type="password" name="mdp" placeholder="Mot de passe">
                    </section><br>
                    <div>
                        <button type="submit">Se connecter</button> 
                    </div><br>
                </form>
            </div>
            <c:import url="_PIED.jsp"/>
            <c:import url="_JAVASCRIPT.jsp"/>
        </div>
    </body>
</html>



        