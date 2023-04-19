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
<%@ page import="static java.lang.System.out" %>
<%
    int start = 0,End = 0;
    String spageid=request.getParameter("page");
    int pageid=Integer.parseInt(spageid);
    out.println("Page:"+pageid);
    if(pageid==1){
        start=0;
        End=2;
    } else if (pageid==2) {
        start=3;
        End=4;
    } else if (pageid==3) {
        start=5;
        End=6;
    }
    //out.println(start+" " +End);
    Connection con = null;
    try {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "bala");
        PreparedStatement p = con.prepareStatement("Select * from student_due_list where reg_no BETWEEN ? and ?;");
        p.setString(1, String.valueOf(start));
        p.setString(2, String.valueOf(End));
        ResultSet r = p.executeQuery();
        out.print("<table border='1' cellpadding='5' width='70%'>");
        out.print("<tr><th>Reg no</th><th>Name</th><th>Total fees</th><th>Paid fees</th><th>Balance fees</th></tr>");
        while (r.next()) {
            out.print("<tr><td>" + r.getString(1) + "</td><td>" + r.getString(2) + "</td><td>"+ r.getString(3) + "</td><td>" + r.getString(4) + "</td><td>"+ r.getString(5) + "</td></tr>");
        }
        out.println("</table>");
        con.close();
    } catch (Exception e) {
        out.println(e);
    }
%>

<div class="tab">
    <a href="stud_due.jsp?page=1">1</a>
    <a href="stud_due.jsp?page=2">2</a>
    <a href="stud_due.jsp?page=3">3</a>
</div>
</body>
</html>
