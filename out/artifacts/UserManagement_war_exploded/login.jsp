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
    <title></title>
</head>
    <body>
    <center>
        <form action="LoginServlet" method="POST">
            username: <input type="text" name="username"><br />
            password: <input type="password" name="password" /><br />
            <input type="submit" value="login" /><br />
        </form>
        <a href="register.jsp">Back</a>
    </center>
    </body>
</html>
