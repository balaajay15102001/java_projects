<html>
<head>
    <title>Auto refresh</title>
</head>
<body>
<%@ page import = "java.io.*,java.util.*" %>
<h1>Current Date & Time is: <%=(new java.util.Date()).toLocaleString()%></h1>
<%response.setIntHeader("Refresh",10);%>
</body>
</html>
