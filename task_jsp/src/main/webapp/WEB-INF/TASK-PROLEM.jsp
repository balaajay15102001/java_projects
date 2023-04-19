<%--
  Created by IntelliJ IDEA.
  User: bala-pt6120
  Date: 21-10-2022
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PROBLEM</title>
</head>
<body>
<% int i,j; %>
<%
for(i=1;i<=3;i++){
    for(j=3;j>=1;j--){
        out.print(i+" ");
    }
    out.println();
}
%>
</body>
</html>
