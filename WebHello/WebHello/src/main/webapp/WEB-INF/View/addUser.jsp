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
            }
            function displayResult2(admin){
                document.getElementById("is_admin2").value=admin;
            }
        </script>

        <script type="text/javascript">
            function l(evn){
                var pictname = event.target.files[0].name;//获取上传的文件名
                var divObj= $(evn).prev()  //获取div的DOM对象
                $(divObj).html(pictname) //插入文件名
                document.getElementById("path").innerText="static/image/"+pictname
                var id = $(evn).attr('id');//获取id
                var num = id.substr(4,1)
                var file = event.target.files[0];
                if (window.FileReader) {
                    var reader = new FileReader();
                    reader.readAsDataURL(file);
                    //监听文件读取结束后事件
                    reader.onloadend = function (e) {
                        $("#"+num).attr("src",e.target.result);
                    };
                }
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
        <script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
        <c:if test="${userinfo==''}">
        <form action="controller?command=addUser" method="post">
            <div class="inputBoxfile">
                <div class="iconlist">
                    <div class="imgs" onclick="document.getElementById('img_1').click()">Select Picture</div>
                    <input type="file" class="img" name="img[]" id="img_1" accept="image/*" onchange="l(this)"/>
                </div>
                <div class="iconlist">
                    <div width="225px"><img src="" width="150px" height="150" id="1" alt="Select User Picture"
                                            style="border: 1.5px solid black;margin-left: 50px"/></div>
                </div>
            </div>

            <div class="inputBox" style="width: 100% ">
                <textarea name="picture" id="path" style="display: none"></textarea>
            </div>
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
                        <input type="radio"  name="admin" value="1" checked="checked" onclick="displayResult2(this.value) ">
                        <label>Admin</label> <br>
                        <input type="radio"  name="admin" value="0" onclick="displayResult2(this.value)" >
                        <label>Not Admin</label> <br>
                    </fieldset>
                </c:if>
                <c:if test="${userinfo.is_admin!=1}">
                    <fieldset>
                        <input type="radio"  name="admin" value="1" onclick="displayResult2(this.value)">
                        <label>Admin</label> <br>
                        <input type="radio"  name="admin" value="0" checked="checked" onclick="displayResult2(this.value) ">
                        <label >Not Admin</label> <br>
                    </fieldset>
                </c:if>
                <div align="center">
                    <input type="submit" name=" " value="Submit">
                    <input type="text" name="is_admin" id="is_admin2" style="display: none" >
                </div>
            </form>

        </c:if>
        <div class="create">
            <a href="controller?command=login">Back</a>
        </div>
    </div>

    </div>

    </body>
</html>