<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Library</title>
    <c:if test="${user.is_admin==1}">
        <jsp:include page="fragment/header.jsp"></jsp:include>
    </c:if>
    <c:if test="${user.is_admin!=1}">
        <jsp:include page="fragment/hnormal.jsp"></jsp:include>
    </c:if>
    <link rel="stylesheet" href="static/css/mainstyle.css">
</head>
<body>
<div class="back">
</div>
<div class="box">
    <div class="boxtop">
        <div class="boxaligin">
            <h3 style="text-align:center; ;font-size: 50px;margin: 5px;">Dear</h3>
            <h3 style="text-align:center; margin:5px;font-size: 50px;font-style:italic;color: #80aaea";>${user.name}</h3>
            <h3 style="text-align:center;font-size: 40px;margin: 5px;">Welcome to Campus Library</h3>
        </div>
        <div class="pict">
            <div class="pictuser">
                <img src=${user.picture} alt="user" style="height:125px;width: 96%;margin: 2px;padding: 0px" >
            </div>
            <div class="picttext">
                <h3 style="text-align:center; ;font-size: 12px;margin: 0px;">${user.id}</h3>
                <h3 style="text-align:center; ;font-size: 12px;margin: 0px;">${login}</h3>
                <h3 style="text-align:center; font-size: 12px;margin: 0px;">${user.name}</h3>
            </div>
        </div>
    </div>
    <h3>Try to scroll this area, and see how the sidenav sticks to the page</h3>
    <p>Notice that this div element has a left margin of 25%. This is because the side navigation is set to 25% width. If you remove the margin, the sidenav will overlay/sit on top of this div.</p>
    <p>Also notice that we have set overflow:auto to sidenav. This will add a scrollbar when the sidenav is too long (for example if it has over 50 links inside of it).</p>
    <p>Some text..</p>
    <p>Some text..</p>
    <p>Some text..</p>
    <p>Some text..</p>
    <p>Some text..</p>
    <p>Some text..</p>
    <p>Some text..</p>
</div>
</body>
</html>