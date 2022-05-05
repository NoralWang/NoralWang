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
            background-color: #f1f1f1;
            position: fixed;
            height: 100%;
            overflow: auto;
        }
        li a {
            display: block;
            color: #000;
            padding: 8px 16px;
            text-decoration: none;
        }

        li a.active {
            background-color: #4CAF50;
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
    <li><a href="controller?command=Rtbook">Return Book</a></li>
    <li><a href="controller?command=history&id=${user.id}">Borrowing History</a></li>
    <li><a href="controller?command=userManagement">User Management</a></li>
    <li><a href="controller?command=addbook">Add Book</a></li>
    <li><a href="controller?command=addUserPage">Add User</a></li>
    <li><a href="controller?command=logout">Logout</a></li>

</ul>
</div>
</body>
</html>