public class TestV1 {

    /*

        Over loading
        ====================
        1. static polymorphism (at compile time) : method overloading
        2. dynamic polymorphism (at runtime): method overriding
        -----------------------------------------------------------

        Method overloading
        ==========================
        => same method name with different signature
           signature
           ===========
           1. number of arguments
           2. type of arguments
           3. position of arguments

     */



    static void f1(Integer x){
        System.out.println("Integer: "+x);
    }

    static void f1(Short x){
        System.out.println("short: "+x);
    }
    static void f1(Long x){
        System.out.println("long: "+x);
    }
    static void f1(Byte x){
        System.out.println("byte: "+x);
    }

    static void f1(Float f){
        System.out.println("Float: "+f);
    }

    static void f1(Double f){
        System.out.println("double: "+f);
    }


    public static void main(String[] args) {
        f1(877); // int
       // f1(76.34f);

    }
}
