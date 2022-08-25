import java.sql.Connection;
import java.sql.SQLException;

public class TestConnnectionDemo {

    public static void main(String[] args) {

        try {
            Connection con=DBUtils.getConnection();
            System.out.println(">>>>>");
            System.out.println(con);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBUtils.closeConnection();
        }

    }
}
