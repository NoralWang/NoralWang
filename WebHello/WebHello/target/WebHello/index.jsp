<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>login UI</title>
    <link rel="stylesheet" href="static/css/index.css">
</head>
    <br>
        <div class="box">
                <h2>login Page</h2>
            <form action="controller?command=login" method="post">
                <div class="inputBox">
                    <input type="text" name="login" required="">
                    <label>ID</label>
                </div>
                <div class="inputBox">
                    <input type="password" name="password" required="">
                    <label>Password</label>
                </div>
                <div align="center">
                <input type="submit" name="" value="submit">
                </div>
            </form>
            <div class="create">
                <a href="controller?command=addUserPage&uid=2">Create new User</a>
            </div>
        </div>

            </br>
            <c:if test="${error_message != null}">
                <div class="login-error">
                ${error_message}
                </div>
            </c:if>

    </body>
</html>


