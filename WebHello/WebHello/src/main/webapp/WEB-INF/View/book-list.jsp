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

        <link rel="stylesheet" href="static/css/booklist.css">
        <meta charset="utf-8">
        <title>Booklist</title>
    </head>
    <body>
    <div class="back">
    </div>
    <div class="movebd">
    <div class="queryst">
        <form action="controller?command=selectbook" method="post">
        <div class="inputBox">
            <input type="text" name="name" >
            <label>Name</label>
        </div>
        <div class="inputBox">
            <input type="text" name="author" >
            <label>Author</label>
        </div>
            <input type="submit" name=" " value="Query">

        </form>
    </div>
    <table>
        <tr>
            <th>Book ID</th>
            <th>Name</th>
            <th>Picture</th>
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
                <td> <img src=${books.picture} alt="Book" style="width: 100px;height: 120px;margin: 0px;padding: 0px"></td>
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
    </div>
    </body>

</html>
