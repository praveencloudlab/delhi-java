import java.sql.*;

public class ResultsetDemo {

    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(">>> Driver class loaded....");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunlife","root","root1234");
            System.out.println(">>> Connected to : "+con.getMetaData().getDatabaseProductName()+" for version "+con.getMetaData().getDatabaseProductVersion());

           // String q1="create table test(id int primary key,name varchar(20))";
            String q2="select *  from test";
            Statement stmt=con.createStatement();
           // PreparedStatement ps=con.prepareStatement(q2);

            ResultSet rs=stmt.executeQuery(q2);

            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println("------------------------------");
            }



            System.out.println(">>> Done <<<");



        }catch (Exception e){
            System.out.println(">> failed due to "+e);
        }






    }

}
