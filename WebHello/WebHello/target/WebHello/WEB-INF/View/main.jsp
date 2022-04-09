<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
    <meta charset="utf-8">

    <title>Main</title>
       <link rel="stylesheet" href="static/css/style.css">
    </head>
    <body>
    <h2>Main Page</h2>

     <!-----start-about-------->
     <div class="about" id="about">
         <div class="wrap">
             <div class="about-grids">
                 <div class="grid1">
                     <div class="dc_zoom_css">
                         <span class="roll_css1">

                         </span>

                     <form action="controller?command=booklist" method="post">
                         <input type="submit" name="booklist" value="booklist">
                     </form></div></div>

                 <div class="grid2">

                     <div class="dc_zoom_css">
                         <span class="roll_css1">

                         </span>

                             <form action="controller?command=addbook" method="post">
                                 <input type="submit" name="addbook" value="addbook">
                             </form></div></div>


                 <div class="grid3">
                     <div class="dc_zoom_css">
                         <span class="roll_css1">

                         </span>
                 <form action="controller?command=logout" method="post">
                  <input type="submit" name="logout" value="logout">
                 </form></div></div>
                 <div class="clear"> </div>

                 <div class="grid3">
                     <div class="dc_zoom_css">
                         <span class="roll_css1">

                         </span>
                         <form action="controller?command=addUserPage" method="post">
                             <input type="submit" name="addUser" value="addUser">
                         </form></div></div>
                 <div class="clear"> </div>
             </div>
         </div>
     </div>
     <!---------end-about------------->

</body>
</html>