<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <c:if test="${user.is_admin==1}">
        <jsp:include page="fragment/header.jsp"></jsp:include>
    </c:if>
    <c:if test="${user.is_admin!=1}">
        <jsp:include page="fragment/hnormal.jsp"></jsp:include>
    </c:if>

    <link rel="stylesheet" href="static/css/adduserbook.css">
    <meta charset="utf-8">
    <title>Return Book</title>
</head>
<body>
<div class="back">
</div>
<div class="movebd">
    <h2>Return Book</h2>
    <div class="box">
        <h2>Return Book</h2>
        <form action="controller?command=Rtbook" method="post">
            <div class="inputBox">
                <input type="text" name="book_id" required="">
                <label>Book ID</label>
            </div>
            <div align="center">
                <input type="submit" name="" value="Return">
            </div>
        </form>
    </div>
</div>
</body>
</html>