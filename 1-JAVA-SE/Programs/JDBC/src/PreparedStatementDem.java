import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDem {

    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(">>> Driver class loaded....");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunlife","root","root1234");
            System.out.println(">>> Connected too MYSQL");

           // String q1="create table test(id int primary key,name varchar(20))";
            String q2="insert into test values(?,?)";
            //Statement stmt=con.createStatement();
            PreparedStatement ps=con.prepareStatement(q2);
            ps.setString(2,"Rose");
            ps.setInt(1,17);

            ps.executeUpdate();
            System.out.println(">>> Done <<<");



        }catch (Exception e){
            System.out.println(">> failed due to "+e);
        }






    }

}
