<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <c:if test="${ clientConnecte ne null }">
        <h2>Bonjour ${clientConnecte.login}</h2>
    </c:if>
    <a href="<c:url value="/homepage"/>">Accueil</a>  
    <a href="<c:url value="/lister-clients"/>">Clients</a>
    <a href="">Produits</a>
    <a href="">Catégories</a>
    <c:if test="${ clientConnecte ne null }">
        <a href="<c:url value="/mon-compte"/>">Mon compte</a>
        <a href="<c:url value="/logout"/>">Logout</a>
    </c:if>
    <c:if test="${ clientConnecte eq null }">
        <a href="<c:url value="/connection"/>">Login</a>
        <a href="<c:url value="/inscription"/>">Inscription</a>
    </c:if>
</nav>