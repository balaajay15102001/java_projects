<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    .tab{
      tab-size:2;
    }
  </style>
</head>
<body>
<%@ page import ="java.io.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.sql.DriverManager.*"%>
<%
  Connection con= null;
  try{
    Class.forName("org.postgresql.Driver");
    con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice","postgres","bala");
    Statement stmt=con.createStatement();
    ResultSet r=stmt.executeQuery("select * from pagination where Person_id BETWEEN '2' and '4';");
    out.print("<table border='1' cellpadding='5' width='70%'>");
    out.print("<tr><th>Person_Id</th><th>Name</th><th>Phone_no</th>");
    while(r.next()){
      out.print("<tr><td>"+r.getString(1)+"</td><td>"+r.getString(2)+"</td><td>"+r.getString(3)+"</td></tr>");
    }
    out.println("</table>");
    con.close();
  }
  catch(Exception e){
    out.println(e);
  }
%>
<div class="tab">
  <a href="pagination.jsp?page=1">1</a>
  <a href="page-2.jsp?page=2">2</a>
  <a href="page-3.jsp?page=3">3</a>
</div>
</body>
</html>
