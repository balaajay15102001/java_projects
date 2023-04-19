import java.io.*;
import  java.sql.*;
import java.sql.DriverManager.*;
class  prac_connec {
    public static void main(String args[]){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice","postgres","bala");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from practice");
            while(rs.next())
                System.out.println(rs.getString("id")+"  "+rs.getString("name")+"  "+rs.getString("address"));
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("open");
    }
}
