<%-- 
    Document   : ajouter-categorie
    Created on : 9 juil. 2018, 12:30:12
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nouvelle catégorie</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div id="supercontainer">
            <div id="container">
                <form id="contenu" method="POST">
                    <header>
                        <span></span>
                        <h1>Nouvelle Catégorie</h1>
                        <span></span>
                    </header>
                    <section>
                        <input type="text" name="nom" placeholder="Catégorie">
                    </section><br>  
                    <footer>
                        <button type="submit">Valider</button> 
                    </footer><br>
                </form>
            </div>
        </div>
        
    </body>
</html>
