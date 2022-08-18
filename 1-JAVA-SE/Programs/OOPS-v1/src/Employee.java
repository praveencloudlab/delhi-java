public class Employee {

     // properties / variables / fields
    /*
        properties
        ============
        1. instance
        2. static
        3. final

        methods
        ========
        1. instance
        2. static
        3. final
        4. abstract
        5. native

        constructor
        ================
        1. default / zero argument
        2. argument

        blocks
        =============
        1. instance
        2. static


         Objects
         =============
         => we need object to access non-static data from static methods
            with in the same class
         => we need object to access non-static data from static and
            non-static methods from different class

         => instance data can not ve accessed directly from
            static methods
         => instance data can be accessed directly from
            instance methods
         => static data can be access directly from instance
            and static methods


         */

    int x; // instance
    int i=100;
    void f1(){
        x=100;

        y=87;
    } // instance method
    static void f2(){
        System.out.println("Static method");
        Employee e2=new Employee();
        e2.x=988;
       // x=765;
        y=999;
    } // static method
      static int y; // static






    public static void main(String[] args) {
        Employee e1;
        e1=new Employee();

         f2();
         e1.f1();
        //

       // x=10;

        // how to create an object
        int i=8;


        y=20;
        System.out.println(y);


    }




}
