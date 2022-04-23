<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<c:forEach items="${user}" var="user">--%>
<%--<% if (${user}.is_admin!=1) %>--%>
<jsp:include page="fragment/header.jsp"></jsp:include>
<%--<% else %>--%>
<%--    <jsp:include page="fragment/hnormal.jsp"></jsp:include>--%>
<%--<% endif %>--%>
<html>
<div style="margin-left:20%;border-style:solid;border-width:5px;
    border-color: #4CAF50;padding:1px 16px;height:1000px;">
<head>
    <meta charset="utf-8">
    <title>Library</title>
</head>
    <div class="usermess">
    ${user.id}
    ${user.name}
    </div>
    <h2>Welcome to Library</h2>
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