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
                   <input type="submit" name="" value="submit">
               </form>
           </div>

       </div>
    </body>
</html>