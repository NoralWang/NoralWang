<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <c:if test="${user.is_admin==1}">
            <jsp:include page="fragment/header.jsp"></jsp:include>
        </c:if>
        <c:if test="${user.is_admin!=1}">

        </c:if>
        <link rel="stylesheet" href="static/css/adduserbook.css">
        <title>User Account</title>
    <meta charset="utf-8">
        <script>
            function displayResult(admin){
                document.getElementById("is_admin1").value=admin;
                document.getElementById("is_admin2").value=admin;
;
            }
        </script>
    </head>
    <body>
    <div class="back">
    </div>
    <div class="movebd">
    <h2>Create & Update User Page</h2>
    <div class="box">
        <h2>Create & Update Account</h2>
        <c:if test="${userinfo==''}">
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
                <input type="text" name="picture" required="">
                <label>Picture</label>
            </div>
            <div class="inputBox">
                <input type="password" name="password" required="">
                <label>Password</label>
            </div>
            <c:if test="${uid=='1'}">
            <fieldset>
                <input type="radio" id="html" name="admin" onclick="displayResult(this.value)" value="1">
                <label for="html">Admin</label><br>
                <input type="radio" id="css" name="admin" onclick="displayResult(this.value)" value="0">
                <label for="css">Not Admin</label><br>
            </fieldset>
            </c:if>
            <c:if test="${uid=='2'}">
            <fieldset>
                <input type="radio"  name="admin" onclick="displayResult(this.value)" value="0" required="">
                <label for="css">Not Admin</label><br>
            </fieldset>
                <div class="create">
                    <a href="controller?command=login">Back</a>
                </div>
            </c:if>
            <div align="center">
                <input type="submit" name=" " value="Submit">
                <input type="text" name="is_admin" id="is_admin1" style="display: none" >
            </div>
        </form>

        </c:if>


        <c:if test="${userinfo!=''}">
            <form action="controller?command=addUser" method="post">
                <div class="inputBox">
                    <input type="text" name="id"  value="${userinfo.id}">
                    <label>Name</label>
                </div>
                <div class="inputBox">
                    <input type="text" name="name"  value="${userinfo.name}">
                    <label>Name</label>
                </div>
                <div class="inputBox">
                    <input type="text" name="surname" value="${userinfo.surname}">
                    <label>SurName</label>
                </div>
                <div class="inputBox">
                    <input type="text" name="login" value="${userinfo.loginac}">
                    <label>LoginAccount</label>
                </div>
                <div class="inputBox">
                    <input type="text" name="picture" value="${userinfo.picture}">
                    <label>Picture</label>
                </div>
                <div class="inputBox">
                    <input type="password" name="password" value="${userinfo.password}">
                    <label>Password</label>
                </div>
                <c:if test="${userinfo.is_admin==1}">
                    <fieldset>
                        <input type="radio"  name="admin" value="1" checked="checked" onclick="displayResult(this.value) ">
                        <label>Admin</label> <br>
                        <input type="radio"  name="admin" value="0" onclick="displayResult(this.value)" >
                        <label>Not Admin</label> <br>
                    </fieldset>
                </c:if>
                <c:if test="${userinfo.is_admin!=1}">
                    <fieldset>
                        <input type="radio"  name="admin" value="1" onclick="displayResult(this.value)">
                        <label>Admin</label> <br>
                        <input type="radio"  name="admin" value="0" checked="checked" onclick="displayResult(this.value) ">
                        <label >Not Admin</label> <br>
                    </fieldset>
                </c:if>
                <div align="center">
                    <input type="submit" name=" " value="Submit">
                    <input type="text" name="is_admin" id="is_admin2" style="display: none">
                </div>
            </form>

        </c:if>

    </div>

    </div>

    </body>
</html>