<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        .tab{
            tab-size:2;
        }
    </style>
</head>
<body>
<h1><%= "Welcome to pagination trails" %>
</h1>
<br/>
<div class="tab">
    <a href="pagination.jsp?page=1">1</a>
    <a href="page-2.jsp?page=2">2</a>
    <a href="page-3.jsp?page=3">3</a>
</div>
</body>
</html>