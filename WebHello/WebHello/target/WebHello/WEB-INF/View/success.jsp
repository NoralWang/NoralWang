<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Library</title>
    <c:if test="${user.is_admin==1}">
        <jsp:include page="fragment/header.jsp"></jsp:include>
    </c:if>
    <c:if test="${user.is_admin!=1}">
        <jsp:include page="fragment/hnormal.jsp"></jsp:include>
    </c:if>
    <link rel="stylesheet" href="static/css/success.css">
</head>
<body>
<div class="back">
</div>
<div class="box">
    <h2 style="text-align:center; margin-top:0%;">
        Dear</h2>
    <h1>${user.name}</h1>
    <h2>Borrow/Return ${bookinfo.name} Successful</h2>
    </br>
    <h3>Thank you for Using it</h3>

    <form action="controller?command=Return" method="post">
        <input type="submit" name=" " value="Return To Main Page">
    </form>
</div>

</body>
</html>