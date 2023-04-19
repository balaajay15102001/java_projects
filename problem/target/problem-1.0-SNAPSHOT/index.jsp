<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>PROBLEM</title>
</head>
<body>
<% int i,j; %>
<%
    for(i=1;i<=3;i++){
        for(j=5;j>=i;j--){
            if(i<=3) {
                out.print(i + " ");
            }
        }
        out.println("<br>");
    }
    for(i=2;i>=1;i--){
        for(j=1;j<=i;j++){
            out.print(i + " ");
        }
        out.println("<br>");
    }
%>
</body>
</html>