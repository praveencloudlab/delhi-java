import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BatchUpdateDemo {

    public static void main(String[] args) {
        try {


            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunlife","root","root1234");

            con.setAutoCommit(false);

           String q1="insert into test values(20,'Veen')";
           String q2="update test set name='new-name-1' where id=16";
           String q3="delete from  test where id=18";

           Statement stmt=con.createStatement();
           stmt.addBatch(q1); // 0 index
           stmt.addBatch(q2); // 1 index
           stmt.addBatch(q3); // 2 index


           int res[]= stmt.executeBatch();

           int count=0;
           boolean flag=true;

           for(int i=0;i<res.length;i++){
               System.out.println("res["+i+"] => "+res[i]);
               if(res[i]==1){
                   count++;
               }else{
                   flag=false;
               }

           }

            System.out.println(count+" statement(s) executed ...");

           if(flag){
               con.commit();
           }else{
               con.rollback();
           }



        }catch (Exception e){
            System.out.println(">> failed due to "+e);
        }






    }

}
