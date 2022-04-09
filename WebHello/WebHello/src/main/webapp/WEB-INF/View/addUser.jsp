<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
    <meta charset="utf-8">

    <title>Create New Account</title>
       <link rel="stylesheet" href="static/css/adduser.css">
    </head>
    <body>
    <h2>Create New Account</h2>
    <div class="box">
        <h2>Create User Page</h2>
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
            <input type="submit" name="" value="submit">
        </form>
    </div>

    </br>
    <c:if test="${error_message != null}">
        <div class="Create User-error">
                ${error_message}
        </div>
    </c:if>

</body>
</html>