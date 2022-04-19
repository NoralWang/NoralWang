<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>login UI</title>
    <link rel="stylesheet" href="static/css/mainstyle.css">
</head>
<html>
<body>

<div class="box">
    <h2>Add Book</h2>

    <form action="controller?command=addbookPage" method="post">
        <div class="inputBox">
            <input type="text" name="name" required="">
            <label>AddBook</label>
        </div>
        <div class="inputBox">
            <input type="text" name="description" required="">
            <label>description</label>
        </div>
        <div class="inputBox">
            <input type="text" name="publish_Year" required="">
            <label>publishYear</label>
        </div>
        <div class="inputBox">
            <input type="text" name="location_ID" required="">
            <label>locationID</label>
        </div>
        <div class="inputBox">
            <input type="text" name="author" required="">
            <label>author</label>
        </div>
        <div class="inputBox">
            <input type="text" name="genre_id" required="">
            <label>genre_id</label>
        </div>
        <input type="submit" name="" value="submit">
    </form>
</div>

</div>
</body>
</html>