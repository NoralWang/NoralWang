<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="fragment/header.jsp"></jsp:include>

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
    <table>
        <tr>
            <th>Book ID</th>
            <th>Name</th>
            <th>Location ID</th>
            <th>Author</th>
            <th>Borr Time</th>
            <th>Borr User</th>
            <th>LoginID</th>
            <th>Return Time</th>
            <th>Button</th>
        </tr>

        <c:forEach items="${history}" var="history">
            <tr>
                <td> ${history.book_id}</td>
                <td> ${history.name}</td>
                <td> ${history.LOCATION_ID}</td>
                <td>${history.AUTHOR}</td>
                <td> ${history.borr_time}</td>
                <td> ${history.borr_userid}</td>
                <td> ${history.borr_username}</td>
                <td>${history.return_time}</td>

            <td>
            <a href="controller?command=Rtbook&book_id=${history.book_id}">
                   <input type="submit" name="" value="Update">
               </a>
            </td>
            </tr>
        </c:forEach>
        <div id="pagination">
            <button id="prev"></button>
            <span id="pages"></span>
            <button id="next"></button>
        </div>
    </table>
<br>
    </body>
</div>
</html>
