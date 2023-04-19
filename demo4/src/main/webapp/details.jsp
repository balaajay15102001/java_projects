<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ page import = "java.io.*,java.util.*" %>
<%
    Date login_time=new Date(session.getCreationTime());
    Date logout_time=new Date(session.getLastAccessedTime());
    Integer visitcount= 0;
    String welcome="Welcome";
    String visitcountkey=new String("visitcount");
    String userIdkey=new String("userId");
    String userId = request.getParameter("name");
    if (session.isNew()){
        welcome = "Welcome to my website";
        session.setAttribute(userIdkey, userId);
        session.setAttribute(visitcountkey,  visitcount);
    }
    visitcount = (Integer)session.getAttribute(visitcountkey);
    visitcount = visitcount + 1;
    userId = (String)session.getAttribute(userIdkey);
    session.setAttribute(visitcountkey,  visitcount);

%>
<html>
<head>
    <title>JSP - Session Tracking</title>
</head>
<body>
<table border = "1" align = "center">
    <tr bgcolor = "yellow">
        <th>Session information</th>
        <th>Details</th>
    </tr>
    <tr>
        <td>id</td>
        <td><% out.print(session.getId()); %></td>
    </tr>
    <tr>
        <td>Login Time</td>
        <td><% out.print(login_time); %></td>
    </tr>
    <tr>
        <td>Time of Last Logout</td>
        <td><% out.print(logout_time); %></td>
    </tr>
    <tr>
        <td>User ID</td>
        <td><% out.print(userId); %></td>
    </tr>
    <tr>
        <td>Number of visits</td>
        <td><% out.print(visitcount); %></td>
    </tr>
</table>
<a href="LOGOUT.jsp">if you want to logout?</a>
</body>
</html>