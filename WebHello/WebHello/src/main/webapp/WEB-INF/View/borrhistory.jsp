<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>


    <head>
        <meta charset="utf-8">
        <title>Booklist</title>
        <c:if test="${user.is_admin==1}">
            <jsp:include page="fragment/header.jsp"></jsp:include>
        </c:if>
        <c:if test="${user.is_admin!=1}">
            <jsp:include page="fragment/hnormal.jsp"></jsp:include>
        </c:if>

        <link rel="stylesheet" href="static/css/booklist.css">
    </head>
    <body>
    <div class="back">
    </div>
    <div class="movebd">
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
                        <c:if test="${history.return_time==null}">
                        <input type="submit" name="" value="Ruturn">
                        </c:if>
                    </a>
                 </td>
            </tr>
        </c:forEach>
    </table>
<br>
    </div>
    </body>
</html>
