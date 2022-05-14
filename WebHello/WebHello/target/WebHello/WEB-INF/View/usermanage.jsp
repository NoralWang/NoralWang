<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>Booklist</title>
        <jsp:include page="fragment/header.jsp"></jsp:include>
        <link rel="stylesheet" href="static/css/booklist.css">
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
    <div class="movebd">
    <div class="queryst">
        <form action="controller?command=selectUser" method="post">
        <div class="inputBox">
            <input type="text" name="name" >
            <label>User Name</label>
        </div>
        <div class="inputBox">
            <input type="text" name="userid" >
            <label>User ID</label>
        </div>
        <div align="center">
            <input type="submit" name="" value="Query">
        </div>
        </form>

    </div>
    <table>
        <tr>
            <th>User ID</th>
            <th>Name</th>
            <th>SurName</th>
            <th>Login Account</th>
            <th>Button</th>
        </tr>

        <c:forEach items="${users}" var="users">
            <tr>
                <td> ${users.id}</td>
                <td> ${users.name}</td>
                <td> ${users.surname}</td>
                <td>${users.login}</td>
            <td>
<%--<a href="controller?command=userManagemen=${users.id}">&ndash;%&gt;--%>
                   <input type="submit" name="" value="Update">
<%--               </a>--%>
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
