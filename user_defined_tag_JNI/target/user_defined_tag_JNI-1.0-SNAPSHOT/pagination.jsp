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
<%!
    public void value(int front, int rear) throws ClassNotFoundException, SQLException {
        out.println("Hello");
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            out.println(front + "   " + rear);
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "bala");
            PreparedStatement p = con.prepareStatement("select * from pagination where Person_id BETWEEN ? and ?;");
            p.setString(1, String.valueOf(front));
            p.setString(2, String.valueOf(rear));
            ResultSet r = p.executeQuery();
            out.print("<table border='1' cellpadding='5' width='70%'>");
            out.print("<tr><th>Person_Id</th><th>Name</th><th>Phone_no</th>");
            while (r.next()) {
                out.print("<tr><td>" + r.getString(1) + "</td><td>" + r.getString(2) + "</td><td>" + r.getString(3) + "</td></tr>");
            }
            out.println("</table>");
            con.close();
        } catch (Exception e) {
            out.println(e);
        }
    }
%>
<%
    int start,End;
    String spageid=request.getParameter("page");
    int pageid=Integer.parseInt(spageid);
    out.println("Page:"+pageid);
    if(pageid==1){
        out.println("hello");
        start=0;
        End=2;

       value(start,End);
       out.println("Weell");
    } else if (pageid==2) {
        start=2;
        End=4;
        value(start,End);
    } else if (pageid==3) {
        start=4;
        End=6;
        value(start,End);
    }
    %>

<div class="tab">
    <a href="pagination_jsp.jsp?page=1">1</a>
    <a href="pagination_jsp.jsp?page=2">2</a>
    <a href="pagination_jsp.jsp?page=3">3</a>
</div>
</body>
</html>
