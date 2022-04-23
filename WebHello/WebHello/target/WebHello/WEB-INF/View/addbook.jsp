<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<jsp:include page="fragment/header.jsp"></jsp:include>
<link rel="stylesheet" href="static/css/adduserbook.css">
<div class="movebd">
    <head>
        <meta charset="utf-8">
        <title>login UI</title>
    </head>
<body>
    <h2>Create New Book</h2>
    <div class="box">
        <h2>Create New Book</h2>
    <form action="controller?command=addbookPage" method="post">
        <div class="inputBox">
            <input type="text" name="name" required="">
            <label>Book Name</label>
        </div>
        <div class="inputBox">
            <input type="text" name="description" required="">
            <label>description</label>
        </div>
        <div class="inputBox">
            <input type="text" name="publish_Year" required="">
            <label>publishYear</label>
        </div>
        <div class="inputBox">
            <input type="text" name="location_ID" required="">
            <label>locationID</label>
        </div>
        <div class="inputBox">
            <input type="text" name="author" required="">
            <label>author</label>
        </div>
        <div class="inputBox">
            <input type="text" name="genre_id" required="">
            <label>genre_id</label>
        </div>
        <div align="center">
        <input type="submit" name="" value="submit">
        </div>
    </form>
 </div>
    </br>
    <c:if test="${error_message != null}">
        <div class="Create User-error">
                ${error_message}
        </div>
    </c:if>
</body>
</div>
</html>