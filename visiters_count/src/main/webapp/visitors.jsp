<html>
<head>
    <title>count the visiters</title>
</head>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import="jakarta.persistence.criteria.CriteriaBuilder" %>
<%
    Date login_time=new Date(session.getCreationTime());
    Date logout_time=new Date(session.getLastAccessedTime());
    Integer count=0;
    String userid=request.getParameter("name");
    String countkey =new String("count");
    String userkey=userid;
    if(session.isNew()){
        String intro = "Welcome to my website";
        session.setAttribute(countkey,count);
        count= (Integer) session.getAttribute(countkey);
        session.setAttribute(userkey,userid);
    }
    try {
        count= (Integer) session.getAttribute(countkey);
        count=count+1;
        userid= (String) session.getAttribute(userkey);
        session.setAttribute(userkey,userid);
    }
    catch (Exception e){
        out.print(e);
    }

%>
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
        <td><% out.print(userid); %></td>
    </tr>
    <tr>
        <td>count of visits</td>
        <td><% out.print(count); %></td>
    </tr>
</table>
</body>
</html>
