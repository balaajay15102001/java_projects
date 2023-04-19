<html>
<body>
<%-- <%@ Page errorPage="error_handle.jsp"%>  --%>
<%
  String name = request.getParameter("first_name").toLowerCase();
  String email=request.getParameter("email");
  String password=request.getParameter("password");
%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager.*"%>
<%@page import="userpage.jsp"%>
<%!
  class db_connect{
    static void db_execute(String query) throws ClassNotFoundException, SQLException {
      Connection conc = null;
      try {
        Class.forName("org.postgresql.Driver");
        conc = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "bala");
        Statement stmt = conc.createStatement();
        //System.out.println(query);
        stmt.execute(query);
        conc.close();
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
    static ResultSet connectExecuteQuery(String query) throws SQLException {
//      DriverManager.registerDriver(new org.postgresql.Driver());
      Connection c = null;
      try {
        Class.forName("org.postgresql.Driver");
        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/swiggy", "postgres", "bala");
        Statement s=c.createStatement();
        //System.out.println(query);
        ResultSet d=s.executeQuery(query);
        c.close();
        return d;
      }
      catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        System.exit(0);
      }
      return null;
    }
  }
%>
<%
  ResultSet owner_page_details = db_connect.connectExecuteQuery("select * from hotel_user_login");
  while(owner_page_details.next()){
    // hot_id + "#" + name + "#" + hot_loc + "#" + code + "#" + item + "#" + quant + "#" + price;
    out.print(owner_page_details.getString(1)+" "+owner_page_details.getString(2)+" "+
            owner_page_details.getString(3));
  }
%>
</body>
</html>