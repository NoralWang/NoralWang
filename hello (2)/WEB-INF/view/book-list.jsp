<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style type="text/css">
    body {
    background-image: url("bookslist.jpg");
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
    }
</style>
</head>
    <body>
    <div style="position: relative; top:50px;left:150px; transform: rotate(-25deg);vertical-align:middle;">
        <h2 class="h2">Book list </h2>
        <c:forEach items="${books}" var="book">
       	    ${book.name}<br/>
        </c:forEach>
    </div>
    </body>
</html>