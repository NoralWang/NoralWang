<html>
<head>
  <meta charset="UTF-8" />
  <title>Document</title>
<style type="text/css">
    body {
    background-image: url("book.jpg");
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
    }
</style>
</head>
    <body>
    <div style="position: relative; top:200px; left: 200px;">
    <div style="float:left; margin:50px">
        <a href="controller?command=bookList">
        <img src="booklist.jpg" alt="HTML tutorial" style="border:1px solid black;width:200px;height:200px;">
        </a>
        <h2 style="text-align:center;">booklist</h2>
    </div>
    <div style="float:left;margin:50px">
        <a href="controller?command=addBook">
        <img src="add.jpg" alt="HTML tutorial" style="border:1px solid black;width:200px;height:200px;">
        </a>
        <h2 style="text-align:center;">addBook</h2>
    </div>
    <div style="float:left;margin:50px">
        <a href="controller?command=logout">
        <img src="logout.jpg" alt="HTML tutorial" style="border:1px solid black;width:200px;height:200px;">
        </a>
        <h2 style="text-align:center;">logout</h2>
    </div>
    </div>
    </body>
</html>