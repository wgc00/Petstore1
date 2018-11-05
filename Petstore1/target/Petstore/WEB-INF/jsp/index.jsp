<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin: auto; border: black solid 1px; width: 980px">
    <%@include file="nav.jsp"%>

    <div style="width: 80%; height: 100%; border: blue solid 2px;float: right">
        <form:form action="/user/insert" method="post">
            <table align="center">
                <tr>
                    <th>用户名</th>
                    <td><input type="text" name="userName"></td>
                </tr>
                <tr>
                    <th>姓氏</th>
                    <td><input type="text" name="userFirstName"></td>
                </tr>
                <tr>
                    <th>名字</th>
                    <td><input type="text" name="userLastName"></td>
                </tr>
                <tr>
                    <th>邮箱</th>
                    <td><input type="text" name="userEmail"></td>
                </tr>
                <tr>
                    <th>密码</th>
                    <td><input type="password" name="userPassword"></td>
                </tr>
                <tr>
                    <th>电话</th>
                    <td><input type="text" maxlength="11" name="userPhone"></td>
                </tr>
                <tr>
                    <td><input type="submit"></td>
                </tr>
            </table>
        </form:form>
        <p>
        <table align="center">
            <tr>
                <th>用户名</th>
                <th>姓氏</th>
                <th>名字</th>
                <th>邮箱</th>
                <th>密码</th>
                <th>电话</th>
                <th>状态</th>
                <th>操作</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${user}" var="u">
            <tr>
                <td>${u.userName}</td>
                <td>${u.userFirstName}</td>
                <td>${u.userLastName}</td>
                <td>${u.userEmail}</td>
                <td>${u.userPassword}</td>
                <td>${u.userPhone}</td>
                <td>${u.userStatus}</td>
                <td><a href="/user/delete/${u.userId}">删除</a></td>
                <td><a href="/user/update/${u.userId}">修改</a></td>
            </tr>
            </c:forEach>

        </p>

        </table>
    </div>
    <div style="clear: both"></div>
</div>
</body>
</html>
