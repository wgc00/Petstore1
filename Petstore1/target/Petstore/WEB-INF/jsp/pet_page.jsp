<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/11/5
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <ul>
        <li>
            <c:forEach items="${pet.photo}" var="p">
                <%-- <img src="${p.photoUrl}" alt="${pet.petName}"><br>--%>
                <img src="/img/${p.photoUrl}" width="200px" height="200px"><br>
            </c:forEach>
        </li>
        <li>${pet.petName}</li>
        <li>${pet.category.categoryName}</li>
        <li>
            <c:forEach items="${pet.tag}" var="p">
                ${p.tagName}<br>
            </c:forEach></li>
        <li>${pet.petStatus}</li>
    </ul>
</div>
</body>
</html>
