import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static Connection con;
    public static Connection getConnection(){
        try {
            FileInputStream fis=new FileInputStream("src/db.properties");
            Properties props = new Properties();
            props.load(fis);
            if(con==null) {
                con = DriverManager.getConnection((String) props.get("db_url"), (String) props.get("db_user"), (String) props.get("db_password"));
                return con;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public  static  void closeConnection() {
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
        }
    }




}
