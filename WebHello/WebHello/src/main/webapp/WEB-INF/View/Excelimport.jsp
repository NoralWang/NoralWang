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

                // document.getElementById("tablei").innerHTML = JSON.stringify(persons, null, 100);

                for(i=0;i<persons.length;i++){
                    document.getElementById("1").innerHTML = JSON.stringify(persons[i].ID);
                    document.getElementById("2").innerHTML = JSON.stringify(persons[i].NAME);
                    document.getElementById("3").innerHTML = JSON.stringify(persons[i].YEAR);
                    document.getElementById("4").innerHTML = JSON.stringify(persons[i].AUTHOR);
                    document.getElementById("5").innerHTML = JSON.stringify(persons[i].LOCATION);
                    document.getElementById("6").innerHTML = JSON.stringify(persons[i].GEN);
                    document.getElementById("7").innerHTML = JSON.stringify(persons[i].DELETE);
                    document.getElementById("8").innerHTML = JSON.stringify(persons[i].PICTURE);
                }
                   };
                   // 以二进制方式打开文件
                   fileReader.readAsBinaryString(files[0]);
               })

</script>

    <table id="tablei" style="margin-left: 30%">
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

       <tr>
           <td id="1"></td>
            <td id="2"></td>
            <td id="3"></td>
           <td id="4"></td>
           <td id="5"></td>
           <td id="6"></td>
           <td id="7"></td>
           <td id="8"></td>
        </tr>
        <tr>

        </tr>
        <tr>

        </tr>

        </div>
    </table>
    </body>
</html>
