<%--
  Created by IntelliJ IDEA.
  User: bala-pt6120
  Date: 21-10-2022
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logout</title>
</head>
<body>
<%String user = request.getParameter("username");%>
<%="Welcome"+user%></br>
<form>
  <button type="submit">Logout</button></form></br>
</form>
</body>
</html>
