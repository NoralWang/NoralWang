<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <c:if test="${user.is_admin==1}">
            <jsp:include page="fragment/header.jsp"></jsp:include>
        </c:if>
        <link rel="stylesheet" href="static/css/adduserbook.css">
        <title>New Account</title>
    <meta charset="utf-8">
    </head>
    <body>
    <div class="movebd">
    <h2>Create User Page</h2>
    <div class="box">
        <h2>Create New Account</h2>
        <form action="controller?command=addUser" method="post">
            <div class="inputBox">
                <input type="text" name="name" required="">
                <label>Name</label>
            </div>
            <div class="inputBox">
                <input type="text" name="surname" required="">
                <label>SurName</label>
            </div>
            <div class="inputBox">
                <input type="text" name="login" required="">
                <label>LoginAccount</label>
            </div>
            <div class="inputBox">
                <input type="password" name="password" required="">
                <label>Password</label>
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
    </div>
    </body>
</html>