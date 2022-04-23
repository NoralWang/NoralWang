<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<jsp:include page="fragment/header.jsp"></jsp:include>
<link rel="stylesheet" href="static/css/adduserbook.css">

<div class="movebd">
    <head>
        <meta charset="utf-8">
        <title>login UI</title>
    </head>
<body>
    <div class="box">
    <h2>Add Book</h2>
    <form action="controller?command=Rtbook=" method="post">
        <div class="inputBox">
            <input type="text" name="book_id" required="">
            <label>Book ID</label>
        </div>
        <div align="center">
        <input type="submit" name="" value="submit">
        </div>
    </form>
 </div>
</body>
</div>
</html>