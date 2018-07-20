<%--
  Created by IntelliJ IDEA.
  User: wu
  Date: 2018/7/19
  Time: 下午3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>后台登录</title>
    <script type="javascript">
        function reset() {
            document.getElementById("username").value = "";
            document.getElementById("password").value = "";
        }
    </script>
</head>
<body>
<form action="/login" method="post">
    <table>
        <tr>
            <td colspan="2" align="center" style="font-size: 24px;">用户登录</td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" id="username" name="username"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" id="password" name="password"/></td>
        </tr>
        <tr>
            <td align="left"><input type="submit" id="submit" name="submit" value="登录"/></td>
            <td align="right"><input type="button" id="clean" name="clean" value="重置" onclick="javascript:reset()"/></td>
        </tr>
    </table>
</form>
</body>
</html>
