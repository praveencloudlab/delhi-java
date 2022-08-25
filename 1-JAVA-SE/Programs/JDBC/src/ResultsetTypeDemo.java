import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultsetTypeDemo {
    public static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunlife","root","root1234");
            String q2="select *  from test";

            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           // PreparedStatement ps=con.prepareStatement(q2);

            ResultSet rs=stmt.executeQuery(q2);

            rs.absolute(4);

            rs.updateString("name","Shiny");
            rs.updateRow();

            //if(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println("------------------------------");
          // }



            System.out.println(">>> Done <<<");



        }catch (Exception e){
            System.out.println(">> failed due to "+e);
        }






    }

}
