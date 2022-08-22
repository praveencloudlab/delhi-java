public class Use {




    public static void main(String[] args) {

        Object[] emps=new Object[5];


        Employee e1=new Employee(10,"Praveen",1000);
        Employee e2=new Employee(10,"Praveen",1000);
       emps[0]=e1;
       emps[1]=e2;
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


    }
}
