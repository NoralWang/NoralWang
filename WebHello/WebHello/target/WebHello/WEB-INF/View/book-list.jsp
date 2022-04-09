<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">

    <title>Main</title>
    <link rel="stylesheet" href="static/css/booklist.css">
</head>
<html>
    <body>
       <form action="controller?command=Return" method="post">
           <input type="submit" name=" " value="Return">
       </form>
       <h2>Book List</h2>
       <div class="about" id="about">
           <div class="wrap">
               <div class="about-grids">
                   <div class="grid1">

                       <div class="dc_zoom_css">
                         <span class="roll_css1">
           </span> </div>
                   </div>
                   <div class="box">
                         <h3>Little Kid</h3>
                       <p>For Kid</p>
                           <input type="submit" name="" value="Buy">

                   </div>
               </div>
           </div>
       </div>
       <!---------end-about1------------->
       <br>
       <div class="about" >
           <div class="wrap">
               <div class="about-grids">
                   <div class="grid2">
                       <div class="dc_zoom_css">
                         <span class="roll_css1">
           </span> </div>
                   </div>
                   <div class="box">
                       <h3>A brief history of mankind</h3>
                       <p>Ordinary people do extraordinary things</p>
                       <input type="submit" name="" value="Buy">

                   </div>
               </div>
           </div>
       </div>
       <!---------end-about2------------->


<br>


       <table border=”1″>
           <tr>
            <th>Book Name</th>

              <td>
                 <c:forEach items="${books}" var="book">
                <td>${book.name}</td> <br>
                 </c:forEach>
               </td>
            </tr>
        </table>
    </body>
</html>