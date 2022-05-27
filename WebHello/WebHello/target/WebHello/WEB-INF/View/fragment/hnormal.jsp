<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Library</title>
    <style>
        body {
            margin: 0;

        }
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 20%;
            position: fixed;
            height: 100%;
            overflow: auto;
            border-width:1px;
            border-color: #38779d;
            border-style:solid;
        }
        li a {
            display: block;
            color: #000;
            padding: 8px 16px;
            text-decoration: none;
        }

        li a.active {
            background-color: #45aeec;
            color: white;
        }

        li a:hover:not(.active) {
            background-color: #555;
            color: white;
        }

    </style>
</head>
<body>
<div class="header">
<ul>
    <li><a class="active" href="controller?command=Return">Main Page</a></li>
    <li><a href="controller?command=booklist" >Book List</a></li>
    <li><a href="controller?command=Rtbookpage">Return Book</a></li>
    <li><a href="controller?command=history&id=${user.id}">Borrowing History</a></li>
    <li><a href="controller?command=logout">Logout</a></li>
</ul>
</div>
</body>
</html>