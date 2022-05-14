<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <style>
    </style>
    <head>
        <c:if test="${user.is_admin==1}">
            <jsp:include page="fragment/header.jsp"></jsp:include>
        </c:if>
        <c:if test="${user.is_admin!=1}">
            <jsp:include page="fragment/hnormal.jsp"></jsp:include>
        </c:if>
        <link rel="stylesheet" href="static/css/bookinfo.css">
        <meta charset="utf-8">
        <title>Book Information</title>
    </head>
    <body>
    <div class="back">
    </div>
    <div class="movebd">
       <h2>Book Info</h2>
       <div class="about" id="about">
           <div class="wrap">
               <a target="_blank" href=${book_id.picture}>
                   <img src=${book_id.picture}; alt="Book Name" width="290" height="360">
               </a>
           </div>
           <div class="box">
               <h3>Name:</h3>
               <h4>${book_id.name}</h4>
               <h3>Book ID:</h3>
               <h4> ${book_id.book_id}</h4>
               <h3> Author</h3>
               <h4>${book_id.author}</h4>
               <h3> Description</h3>
               <p> ${book_id.description}</p>

               <form action="controller?command=booklist" method="post">
                   <input type="submit" name=" " value="Return">
               </form>
               <a href="controller?command=successpage&book_id=${book_id.book_id}&userid=${user.id}&login=
                     ${login}">
               <input type="submit" name=" " value="Borrow" style="margin-left: 30px"></a>
           </div>
       </div>

<br>
</div>
    </body>

</html>
