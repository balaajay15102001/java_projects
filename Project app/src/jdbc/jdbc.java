package jdbc;
import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;
public class jdbc {
        public static void main(String args[]) throws SQLException {
            Connection c = null;
            try {
                DriverManager.registerDriver(new org.postgresql.Driver());
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "bala");
            }
            catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
            System.out.println("Opened database successfully");
        }
    }
