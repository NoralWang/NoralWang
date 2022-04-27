<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:if test="${user.is_admin==1}">
    <jsp:include page="fragment/header.jsp"></jsp:include>
</c:if>
<c:if test="${user.is_admin!=1}">
    <jsp:include page="fragment/hnormal.jsp"></jsp:include>
</c:if>

<link rel="stylesheet" href="static/css/booklist.css">
<div class="movebd">
    <head>
        <meta charset="utf-8">
        <title>Booklist</title>
    </head>
<style>
    table
    {
    width:100%;
    margin-top:4%;
    height: 70%;
    }

</style>
    <body>
    <div class="queryst">
        <div class="inputBox">
            <input type="text" name="BookName" required="">
            <label>Name</label>
        </div>
        <div class="inputBox">
            <input type="text" name="Author" required="">
            <label>Author</label>
        </div>
        <div align="center">
            <input type="submit" name="" value="Query">
        </div>


    </div>
    <table>
        <tr>
            <th>Book ID</th>
            <th>Name</th>
            <th>Author</th>
            <th>Description</th>
            <th>Location ID</th>
            <th>Publish Year</th>
            <th>Genre ID</th>
            <th>Book info</th>
        </tr>

        <c:forEach items="${books}" var="books">
            <tr>
                <td> ${books.book_id}</td>
                <td> ${books.name}</td>
                <td> ${books.author}</td>
                <td>${books.description}</td>
                <td> ${books.location_ID}</td>
                <td> ${books.publish_Year}</td>
                <td> ${books.GENRE_ID}</td>
               <td><a href="controller?command=bookinfo&book_id=${books.book_id}">
                   <input type="submit" name=" " value="View"></a>
               </td>
            </tr>
        </c:forEach>

        </div>
    </table>
<br>
    </body>
</div>
</html>
