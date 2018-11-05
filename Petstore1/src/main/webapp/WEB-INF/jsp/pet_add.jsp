<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <div style="float: left; width: 200px">
        <form:form action="/pet/batchAdd" method="post">
            宠物类型：
            <select name="categoryId" id="">
                <option value="1">猫</option>
                <option value="2">狗</option>
                <option value="3">鸟</option>
                <option value="4">鱼</option>
            </select><br>
            宠物名称：<input type="text" name="petName"><br>
            标签编号：
            <select name="tasId" id="">
                <option value="1">可爱</option>
                <option value="2">萌</option>
                <option value="3">好看</option>
            </select><br>
            宠物状态:
            <select name="petStatus">
                <option value="可用">可用</option>
                <option value="待定">待定</option>
                <option value="已销售">已销售</option>
            </select><br>
            <input type="submit"><br>
        </form:form>
    </div>
    <p>

    </p>
    <div style="float:left; width: 200px">
        <form action="/pet/photo/add" method="post" enctype="multipart/form-data">
            图片：<input type="file" name="photoUrl"><br><br>
            名称：<select name="photoName">
                    <option value="1">波斯猫</option>
                    <option value="2">哈士奇</option>
                    <option value="3">白猫</option>
                    <option value="4">黑猫</option>
                 </select><br><br>
            <input type="submit">
        </form>
    </div>
</div>
</body>
</html>
