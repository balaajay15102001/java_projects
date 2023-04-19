<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display record from database</title>
</head>
<body>
<%
    Connection con= null;
    try{
        Class.forName("org.postgresql.Driver");
        con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice","postgres","bala");
        Statement stmt=con.createStatement();
        ResultSet r = stmt.executeQuery("select * from  stu_registration;");
         out.print("<table border='1' cellpadding='5' width='70%'>");
        out.print("<tr><th>Name</th><th>DOB</th><th>Email</th><th>Mobile no</th>");
        while (r.next()){
            try {
                //out.print(String.format("%18s %18s %18s %18s %18s",r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5)));
                out.print("<tr><td>" + r.getString(1) + "</td><td>" + r.getString(2) + "</td><td>" + r.getString(3) + "</td><td>"+r.getString(4)+"</td></tr>");
            }
            catch (Exception e){

            }
        }
    }
    catch(Exception e){
        out.println(e);
    }
%>
</body>
</html>
