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
    <div class="movebd">
       <h2>Book Info</h2>
       <div class="about" id="about">
           <div class="wrap">
            <img src="../../static/image/1.png" alt="" >
           </div>
           <div class="box">
               <h3> ${book_id.name}</h3>
               <h3> ${book_id.book_id}</h3>
                   <h3> ${book_id.author}</h3>
                       <h3> ${book_id.description}</h3>

               <form action="controller?command=Return" method="post">
                   <input type="submit" name=" " value="Return">
               </form>
               <a href="controller?command=successpage&book_id=${book_id.book_id}&userid=${user.id}&login=
                     ${login}">
               <input type="submit" name=" " value="Borrow"></a>
           </div>
       </div>

<br>
</div>
    </body>

</html>
