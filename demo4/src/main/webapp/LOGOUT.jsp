<html>
<head>
    <title>JSP - Session Tracking</title>
</head>
<body>
<%@ page import="java.util.*"%>
    <%
    Date login_time=new Date(session.getCreationTime());
    Date logout_time=new Date(session.getLastAccessedTime());
    String welcome="Welcome";
    String out_visitcountkey=new String("out_visitcount");
    String userIdkey=new String("userId");
    String userId = request.getParameter("name");
    int out_visit_count = 0;
    if (session.isNew()){
        welcome = "Welcome to my website";
        session.setAttribute(userIdkey, userId);
        session.setAttribute(out_visitcountkey,  out_visit_count);
    }
    if(session.getAttribute(out_visitcountkey)==null){
        session.setAttribute(out_visitcountkey,0);
    }
    out_visit_count = (Integer)session.getAttribute(out_visitcountkey);
    out_visit_count=out_visit_count+1;
    userId = (String)session.getAttribute(userIdkey);
    session.setAttribute(out_visitcountkey,  out_visit_count);

%>
<table border = "1" align = "center">
    <tr bgcolor = "yellow">
        <th>Session information</th>
        <th>Details</th>
    </tr>
    <tr>
        <td>id</td>
        <td><% out.print( session.getId()); %></td>
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
        <td><% out.print(out_visit_count); %></td>
    </tr>
</table>
<form action="LOGOUT.jsp">
    <input type="submit" value="logout" name="logout">
</form>
<h2>Thank you for using our Website </h2>
<%
    if(request.getParameter("logout")!=null){
        if(request.getParameter("logout").equals("logout")){
            session.invalidate();
            response.sendRedirect("http://localhost:8080/demo4_war_exploded/login%20page.html");
        }
    }
%>
</body>
</html>
