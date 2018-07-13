<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${ cookie.nomPays.value == 'belgique' }">
    <link rel="stylesheet" href="css/styleBoutiqueBelgique.css" type="text/css">
</c:if>
<c:if test="${ cookie.nomPays.value == 'jamaique' }">
    <link rel="stylesheet" href="css/styleBoutiqueJamaique.css" type="text/css">
</c:if>

<link rel="stylesheet" href="css/styleBoutique.css" type="text/css">