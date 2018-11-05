<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/user/login" method="get">
        <table>
            <tr>
                <th>账号：</th>
                <td><input type="text" name="name" maxlength="18"></td>
            </tr>
            <tr>
                <th>密码：</th>
                <td><input type="password" name="password" maxlength="16"></td>
            </tr>
        </table>
        <input type="submit" value="登陆">
    </form>
</div>

</body>
</html>
