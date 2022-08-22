import java.util.ArrayList;
import java.util.Arrays;

public class Use {

    /*

       Object[] emps; ///
       add(Employee emp){
        // load all objects from emps,
        // and add emp if emps doesnt have emp content already
       }





     */


    static Object[] emps=new Object[5];

    static{
        Employee e1=new Employee(10,"Praveen",1000);
        Employee e2=new Employee(11,"Praveen",1000);
        Employee e3=new Employee(10,"Praveen",1000);
        Employee e4=new Employee(13,"Praveen",1000);
        Employee e5=new Employee(10,"Praveen",1000);

        emps[0]=e1;
        emps[1]=e2;
        emps[2]=e3;
        emps[3]=e4;
        emps[4]=e5;

    }
    static boolean filterDuplicate() {
        boolean flag=false;
        for (int i = 0; i < emps.length; i++) {
            for (int j = 1; j <= emps.length - 1; j++) {
                if (!emps[i].equals(emps[j])) {
                    flag=true;
                    break;
                }
            }
            if(!flag){
                //System.out.println(emps[j]);
            }

        }
        return false;
    }
    public static void main(String[] args) {

        filterDuplicate();


              //  System.out.println(emps[i]);
              //  System.out.println(emps[i].hashCode());




        /*
        System.out.println("e1 hashcode: "+e1.hashCode());
        System.out.println("e1 identity hashcode: "+System.identityHashCode(e1));
        System.out.println(e1);
        System.out.println("e2 hashcode: "+e2.hashCode());
        System.out.println("e2 identity hashcode: "+System.identityHashCode(e2));
        System.out.println(e2);


        if(e1.equals(e2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

         */


    }
}
