//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.postgresql.Driver;

class db_connect {
    db_connect() {
    }

    static void db_execute(String query) throws ClassNotFoundException, SQLException {
        Connection conc = null;

        try {
            Class.forName("org.postgresql.Driver");
            conc = DriverManager.getConnection("jdbc:postgresql://localhost:5432/portal", "postgres", "bala");
            Statement stmt = conc.createStatement();
            stmt.execute(query);
            conc.close();
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    static ResultSet connectExecuteQuery(String query) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection c = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/portal", "postgres", "bala");
            Statement s = c.createStatement();
            ResultSet d = s.executeQuery(query);
            c.close();
            return d;
        }
        catch (Exception var4) {
            var4.printStackTrace();
            PrintStream var10000 = System.err;
            String var10001 = var4.getClass().getName();
            var10000.println(var10001 + ": " + var4.getMessage());
            System.exit(0);
            return null;
        }
    }
}
