<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>Booklist</title>
        <jsp:include page="fragment/header.jsp"></jsp:include>
        <link rel="stylesheet" href="static/css/booklist.css">
    </head>
    <body>
    <div class="back">
    </div>
    <div class="movebd">
    <div class="queryst">
        <form action="controller?command=selectUser" method="post">
        <div class="inputBox">
            <input type="text" name="name" >
            <label>Name</label>
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
            <th>Image</th>
            <th>Name</th>
            <th>SurName</th>
            <th>Login Account</th>
            <th>IS Admin</th>
            <th>Button</th>
        </tr>

        <c:forEach items="${users}" var="users">
            <tr>
                <td> ${users.id}</td>
                <td> <img src="${users.picture}" alt="Book" style="width: 120px;height: 120px;margin: 0px;padding: 0px"></td>
                <td> ${users.name}</td>
                <td> ${users.surname}</td>
                <td>${users.loginac}</td>
                <td>${users.is_admin}</td>
                <td><a href="controller?command=addUserPage&uid=${users.id}">
                    <input type="submit" name=" " value="Update"></a>
                </td>
            </tr>
        </c:forEach>
    </table>
<br>
    </div>
    </body>
</html>
