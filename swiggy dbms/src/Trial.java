import java.sql.ResultSet;
import java.sql.SQLException;

public class Trial {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        String name,user_id,email,password;
//        name="Bala";
//        user_id="USER01";
//        email="abc@gmail.com";
//        password="12345";
//        String mobile="2345678901";
//        //insert into user_page values('Bala','USER01','abc@gmail.com',2345678901,'12345')
//        db_connect.db_execute("insert into user_page values('"+name+"','"+user_id+"','"+email+"',"+mobile+",'"+password+"');");
        int count=0;
        ResultSet e=db_connect.connectExecuteQuery("select count(user_id) from user_page where name='Bala';");
        while(e.next()){
            count=e.getInt(1);
//            System.out.println(e.getString(1)+" "+e.getString(2)+" "+e.getString(3)+" "+e.getBigDecimal(4)+" "+e.getString(5));
        }
        System.out.println(count);

    }
}
