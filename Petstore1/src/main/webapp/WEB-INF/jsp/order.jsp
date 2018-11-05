<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin: auto; border: black solid 1px; width: 980px">

    <%@include file="nav.jsp" %>


    <div style="width: 80%; height: 100%; border: blue solid 2px;float: right">

        <form:form action="" method="post">
            <table align="center">

            </table>
        </form:form>
        <p>
        <table align="center">
            <tr>

            </tr>

            <c:forEach items="${order}" var="o">
            <tr>

                <td><a href="">删除</a></td>
                <td><a href="">修改</a></td>
            </tr>
            </c:forEach>

        </p>

        </table>
    </div>
    <div style="clear: both"></div>
</div>
</body>
</html>
