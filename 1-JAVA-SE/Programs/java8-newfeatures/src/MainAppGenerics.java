public class MainAppGenerics<E> {

     MainAppGenerics(E bla){

     }


     void f1(E e){
         System.out.println(e.getClass().getTypeName()+" : "+e);
     }

    /*
    void f1(int x){
        System.out.println("Int "+x);
    }
    void f1(float x){
        System.out.println("Float "+x);
    }

    void f1(double x){
        System.out.println("Double "+x);
    }
    void f1(long x){
        System.out.println("Long "+x);
    }

     */

    public static void main(String[] args) {

        MainAppGenerics<Object> ma=new MainAppGenerics<>(88);
        ma.f1("Praveen");

    }
}
