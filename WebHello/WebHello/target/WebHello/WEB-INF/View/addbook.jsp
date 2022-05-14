<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <jsp:include page="fragment/header.jsp"></jsp:include>
        <link rel="stylesheet" href="static/css/addbook.css">
        <meta charset="utf-8">
        <title>New Book</title>
        <script src="jquery.js"></script>
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
    <h2>Create New Book</h2>
    <div class="box"  >
    <form action="controller?command=addbookPage" method="post">
        <div class="inputBox">
            <input type="text" name="name" required="">
            <label>Book Name</label>
        </div>
        <script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
        <div class="inputBoxfile">
        <div class="iconlist">
            <div class="imgs" onclick="document.getElementById('img_1').click()">Select Picture</div>
                <input type="file" class="img" name="img[]" id="img_1" accept="image/*" onchange="l(this)"/>
        </div>
        <div class="iconlist">
            <div width="225px"><img src="" width="225px" height="225" id="1" alt="Select Book Picture"
                                    style="border: 1.5px solid black"/></div>
        </div>
        </div>

        <div class="inputBox" style="width: 90% ">
            <input type="text" name="description" required="" style="width: 760px">
            <label>Description</label>
        </div>
        <div class="inputBox" >
            <input type="text" name="publish_Year" required="">
            <label>PublishYear</label>
        </div>
        <div class="inputBox" >
            <input type="text" name="location_ID" required="">
            <label>LocationID</label>
        </div>
        <div class="inputBox" >
            <input type="text" name="author" required="">
            <label>Author</label>
        </div>
        <div class="inputBox">
            <input type="text" name="genre_id" required="">
            <label>genre_id</label>
        </div>
        <div class="inputBox" style="width: 100% ">
            <textarea name="picture" id="path" style="display: none"></textarea>
        <input type="submit" name="" value="Submit">
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