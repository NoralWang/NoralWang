<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${user.is_admin==1}">
    <jsp:include page="fragment/header.jsp"></jsp:include>
</c:if>
<c:if test="${user.is_admin!=1}">
    <jsp:include page="fragment/hnormal.jsp"></jsp:include>
</c:if>
<html>
<style>
    body{
        background-image:url(../../static/image/indexback.jpg);
        background-repeat: no-repeat;
    }
</style>
<div style="margin-left:20%;border-style:solid;border-width:5px;
    border-color: #4CAF50;padding:1px 16px;height:1000px;">
<head>
    <meta charset="utf-8">
    <title>Library</title>
</head>
<body>
    <h2 style="text-align:center; margin-top:0%;">
        Dear ${user.name} Borrow/Return ${bookinfo.name} Successful</h2>
    <h3>Thank you for Using it</h3>
    <div style="position: relative;
	border: none;
	outline: none;
	color: #fff;
	background: #8bb2aa;
	padding: 10px 20px;
	cursor: pointer;
	border-radius: 5px;">
    <form action="controller?command=Return" method="post">
        <input type="submit" name=" " value="Return">
    </form>
    </div>
</body>
</div>

</body>
</html>