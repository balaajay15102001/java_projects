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
