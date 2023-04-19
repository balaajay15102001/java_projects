<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title> Login Page </title>
  <style>
    Body {
      font-family: Calibri;
      background-color: aquamarine;
    }
    button {
      background-color: #154c79;
      width: 70%;
      color: white;
      padding: 15px;
      margin: 10px 80px;
      border: none;
      box-sizing: content-box;
      cursor: pointer;
    }
    form {
      border: 3px solid #f1f1f1;
    }
    input[type=text], input[type=password] {
      width: 70%;
      margin: 8px 0;
      padding: 12px 20px;
      display: inline-block;
      border: 2px solid green;
      box-sizing: content-box;
    }
    button:hover {
      opacity: 0.7;
    }
    .cancelbtn {
      width: auto;
      padding: 10px 18px;
      margin: 10px 5px;
    }


    .container {
      padding: 10px;
      background-color: lightblue;
    }
  </style>
</head>
<body>
<%@ page errorPage="error_handle.jsp"%>
<center> <h1>Login Form </h1> </center>
<form>
  <div class="container">
    <label>Email : </label>
    <input type="text" placeholder="Enter email" name="email" required></br>
    <label>Password : </label>
    <input type="password" placeholder="Enter Password" name="password" required>
    <button type="submit">Login</button></br>
    <button type="button" class="cancelbtn"> Cancel</button>
    Forgot <a href="#"> password? </a>
  </div>
</form>
<%
String password=request.getParameter("password");
String email=request.getParameter("email");
  Connection con= null;
  try{
    Class.forName("org.postgresql.Driver");
    con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice","postgres","bala");
    Statement stmt=con.createStatement();
    ResultSet r = stmt.executeQuery("select * from  stu_registration;");
    boolean f= true;
    while (r.next()){
      try {
        if(password.equals(r.getString(5)) && email.equals(r.getString(3))){
                out.println("Successfully login");
                f=false;
                response.sendRedirect("http://localhost:8080/demo5_war_exploded/logout.jsp");

        }
      }
      catch (Exception e){

      }
    }
    
  }
  catch(Exception e){
    out.println(e);
  }
%>
<br>
</body>
</html>