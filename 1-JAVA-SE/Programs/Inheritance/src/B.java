
class A{

    int x=10;
    void f1(){
        System.out.println(">>> f1 method of A");
    }

    void f2(){
        System.out.println(">>> f2 method of A");
    }
}
public class B extends A{
    void f1(){
        super.f2();

        System.out.println(">>> f1 method of B");
    }
    void f3(){
        System.out.println(">>> f3 method of B");
    }


    public static void main(String[] args) {
     //  B b=new B();
       // b.f1();

         A a=new B();
         a.f1();
         a.f2();
        // a.f3();


    }
}
