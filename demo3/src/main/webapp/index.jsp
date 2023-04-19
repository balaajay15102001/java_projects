<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Fibonnaci</title>
</head>
<body>
<%@ page import ="java.util.*"%>
<%
int n1=0,n2=1,n3,i,count=10;
out.println(n1+"\n"+n2+"\n");
for(i=2;i<count;++i){
    n3=n1+n2;
    out.println(n3+"\n");
    n1=n2;
    n2=n3;
}%>
</body>
</html>