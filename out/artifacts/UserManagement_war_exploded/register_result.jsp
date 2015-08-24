<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kinglin
  Date: 2015/8/19
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Result</title>
</head>
    <body>
    <center>
        <h1>Register Result</h1>

            <%  String registerResult = (String) request.getAttribute("registerResult");
            if (registerResult.startsWith("1")){%>
                <p>Register success: welcome
                    <c:out value="${registerResult}"/>
                </p>
            <%}else {%>
                <p>Register failed:
                    <c:out value="${registerResult}"/>
                </p><br/>
                <a href="register.jsp">Register again</a>
            <%}%>
    </center>
    </body>
</html>
