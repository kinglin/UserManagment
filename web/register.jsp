<%--
  Created by IntelliJ IDEA.
  User: kinglin
  Date: 2015/8/18
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/myStyle.css">
    <title>Register</title>
</head>
    <body>
    <div id="round" class="center">
        <h1>Register</h1>
        <form action="RegisterServlet" method="POST">
            <ul>
                <li>username: <input class="inputText" type="text" name="username"></li>
                <li>password: <input class="inputText" type="password" name="password" /></li>
                <li><input class="ok" type="submit" value="register" /></li>
            </ul>
        </form>
        <a class="cancel" href="login.jsp">Login</a>
    </div>
    </body>
</html>
