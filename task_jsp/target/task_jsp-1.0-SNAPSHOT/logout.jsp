<%--
  Created by IntelliJ IDEA.
  User: bala-pt6120
  Date: 21-10-2022
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logout</title>
</head>
<body>
<link rel="stylesheet" href="index.css">
<%String user = request.getParameter("username");%>
<p><h1><%="Welcome "+user%></h1></p>
<hr>
<button type="submit"><a href="welcome.html">Logout</a></button></br>
</body>
</html>

