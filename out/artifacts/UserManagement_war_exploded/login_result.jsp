<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kinglin
  Date: 2015/8/19
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Result</title>
</head>
    <body>
        <center>
            <h1>Login Result</h1>
                <%  String loginResult = (String) request.getAttribute("loginResult");
                if (loginResult.startsWith("1")){%>
                    <p>Login success: welcome
                        <c:out value="${loginResult}"/>
                    </p>
                <%}else {%>
                    <p>Login failed:
                        <c:out value="${loginResult}"/>
                    </p><br/>
                    <a href="login.jsp">Login again</a>
                    <a href="register.jsp">Register now</a>
                <%}%>
        </center>
    </body>
</html>
