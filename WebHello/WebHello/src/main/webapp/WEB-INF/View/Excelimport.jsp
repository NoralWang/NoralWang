<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>Booklist</title>
        <jsp:include page="fragment/header.jsp"></jsp:include>
        <link rel="stylesheet" href="static/css/booklist.css">


        <meta charset="UTF-8">
        <title>Excel批量处理</title>
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
        <script src="https://cdn.bootcss.com/xlsx/0.11.5/xlsx.core.min.js"></script>
        </head>
    <body >
    <input type="file" id="excel-file" style="margin-left: 30%">
    <p id="demo">单击按钮给数组添加新的元素。</p>
    <button onclick="myFunction()" style="margin-left: 30%">点我</button>
    <script>
        //给input标签绑定change事件，一上传选中的.xls文件就会触发该函数
        $('#excel-file').change(function(e) {
            var files = e.target.files;
            var fileReader = new FileReader();
            fileReader.onload = function(ev) {
                try {
                    var data = ev.target.result
                    var workbook = XLSX.read(data, {
                        type: 'binary'
                    }) // 以二进制流方式读取得到整份excel表格对象
                    var persons = []; // 存储获取到的数据
                } catch (e) {
                    console.log('文件类型不正确');
                    return;
                }
                // 表格的表格范围，可用于判断表头是否数量是否正确
                var fromTo = '';
                // 遍历每张表读取
                for (var sheet in workbook.Sheets) {
                    if (workbook.Sheets.hasOwnProperty(sheet)) {
                        fromTo = workbook.Sheets[sheet]['!ref'];
                        console.log(fromTo);
                        persons = persons.concat(XLSX.utils.sheet_to_json(workbook.Sheets[sheet]));
                        break; // 如果只取第一张表，就取消注释这行
                    }
                }
                //在控制台打印出来表格中的数据
                console.log(persons);
                persons= new ArrayList();
                   };
                   // 以二进制方式打开文件
                   fileReader.readAsBinaryString(files[0]);
               })

</script>

    <table style="margin-left: 30%">
        <tr>
            <th>Book ID</th>
            <th>Name</th>
            <th>Picture</th>
            <th>Author</th>
            <th>Description</th>
            <th>Location ID</th>
            <th>Publish Year</th>
            <th>Genre ID</th>
        </tr>

        <c:forEach items="${persons}" var="persons">
            <tr>
                <td> ${persons}</td>
                <td> ${persons}</td>
                <td> <img src=${books.picture} alt="Book" style="width: 100px;height: 120px;margin: 0px;padding: 0px"></td>
                <td> $persons}</td>
                <td>${persons}</td>
                <td> ${persons}</td>
                <td> ${persons}</td>
                <td> ${persons}</td>

            </tr>
        </c:forEach>

        </div>
    </table>
    </body>
</html>
