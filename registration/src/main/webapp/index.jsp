<html>
<body>
<h1>Welcome</h1>
<%
    String name= request.getParameter("name");
    String DOB = request.getParameter("DOB");
    String Email = request.getParameter("email");
    String address= request.getParameter("address");
    String mobile = request.getParameter("mobile");
    out.println(name+" "+DOB+" "+Email+" "+address+" "+mobile);
%>
<%@ page import ="java.io.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.sql.DriverManager.*"%>
<%
    Connection con= null;
    try{
        Class.forName("org.postgresql.Driver");
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice","postgres","bala");
        Statement stmt=con.createStatement();
        stmt.execute("insert into  student_details values('" +name + "','" + DOB + "','" + Email
                + "','" + address + "','" + mobile +"');");  }
    catch(Exception e){
        out.println(e);
    }
%>
<p><% out.println("Successfully inserted in the database");%></p>
</body>
</html>