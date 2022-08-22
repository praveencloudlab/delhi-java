
class Person{

    static int  count=1;

    @Override
    protected void finalize() throws Throwable {
        System.out.println(">>> Object is garbage collected.."+count++);
    }
}
public class GC {

    public static void main(String[] args) {

        /*
        Runtime rt=Runtime.getRuntime();
       // System.out.println(rt.availableProcessors());
        System.out.println(rt.maxMemory());
        for(int i=1;i<=1000000000;i++){
            for(int j=1;j<=2;j++){

            }

        }
        System.out.println(rt.freeMemory());

      */

        System.out.println(">>> main <<<");



        /*
        for(int i=0;i<=1000000;i++){
            new Person();
        }

         */



        Person p=new Person();


        p=null;

        System.gc();












    }
}
