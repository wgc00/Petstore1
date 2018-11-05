<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    th, td {
        margin: 5px;
        padding: 5px;
    }
</style>
<body>
<div style="margin: auto; border: black solid 1px; width: 980px">
    <%@include file="nav.jsp" %>
    <div style="width: 80%; height: 100%; border: blue solid 2px;float: right">
        <h2 align="center">欢迎您来到宠物商店</h2>
        <hr>
        <p>
            <form:form action="/pet/tagQuery" method="get">
        <p>
            <input type="button" id="addBtn" value="添加">
            <input type="text" name="name" placeholder="请输入标签、宠物、类型">
            <input type="submit" value="查询">
        </p>
        <table align="center">
            <tr>
                <th>名字</th>
                <th>状态</th>
                <th>标签</th>
                <th>类型</th>
                <th>数量</th>
                <th>日期</th>
                <th>价格</th>
                <th>操作</th>

            </tr>

            <c:forEach items="${pet}" var="p">
                <tr>
                    <td><a href="/pet/name/${p.petName}">${p.petName}</a></td>
                    <td>${p.petStatus}</td>
                    <td>
                        <c:forEach items="${p.tag}" var="t">
                            ${t.tagName}
                        </c:forEach>
                    </td>
                    <td>${p.category.categoryName}</td>
                    <td>${p.inventory.inventoryPrice}</td>
                    <td>${p.inventory.inventoryDepositDate}</td>
                    <td>${p.inventory.inventoryPrice}</td>
                    <td><a href="/pet/delete/${p.petId}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
        </form:form>
    </div>
    <div style="clear: both"></div>
</div>
<script src="../js/jquery.js"></script>
<script>
    $(function () {

        $("#addBtn").on("click", function () {
            location.replace("/pet/pet/add");
            // alert( location.assign("/pet/pet/add"));
        });
    });


</script>
</body>
</html>
