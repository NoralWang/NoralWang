<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:if test="${user.is_admin==1}">
    <jsp:include page="fragment/header.jsp"></jsp:include>
</c:if>
<c:if test="${user.is_admin!=1}">
    <jsp:include page="fragment/hnormal.jsp"></jsp:include>
</c:if>
<link rel="stylesheet" href="static/css/booklist.css">
<div class="movebd">
    <head>
        <meta charset="utf-8">
        <title>Book Information</title>
    </head>
    <body>

       <h2>Book Info</h2>
       <div class="about" id="about">
           <div class="wrap">

           </div>
           <div class="box">
               <h3> ${book.name}</h3>
               <p> ${books.id}</p>
               <p> ${books.author}</p>
               <p> ${books.description}</p>

               <form action="controller?command=Return" method="post">
                   <input type="submit" name=" " value="Return">
                       </form>
                       <form action="controller?command=bookinfo" method="post">
                           <input type="submit" name=" " value="Borrow">
                       </form>
                   </div>
       </div>

<br>
    </body>
</div>
</html>
