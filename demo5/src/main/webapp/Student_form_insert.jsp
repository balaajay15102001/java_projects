<html>
<body>
<%@ page errorPage="error_handle.jsp"%>
<%
  String name = request.getParameter("name");
  String dob = request.getParameter("DOB");
  String email = request.getParameter("email");
  String mobile = request.getParameter("mobile");
  String password =request.getParameter("password");
%>
<%out.print(name);%>
<%out.print(dob);%>
<%out.print(email);%>
<%out.print(mobile);%>
<%@ page import ="java.io.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.sql.DriverManager.*"%>
<%
  Connection con= null;
  try{
    Class.forName("org.postgresql.Driver");
    con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice","postgres","bala");
    Statement stmt=con.createStatement();
    stmt.execute("insert into stu_registration values('"+name+"','"+dob+"','"+email+"','"+mobile+"','"+password+"');");
  }
  catch(Exception e){
    out.println(e);
  }
%>
<p><%="Opened registered Successfully;"%></p>
<form action="Student_login_Register.jsp">
  <label>If you want to login your account:</label>
  <input type="text" name="choice">
  <input type="submit" name="Submit">
</form>

</body>
<html>
