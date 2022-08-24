public class LamdaV2 {

    void f1(){
        System.out.println(">>>> f1 method: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        LamdaV2 v2=new LamdaV2();

        Runnable r1=()->{
            v2.f1();
          // System.out.println(">>> Hello "+Thread.currentThread().getName());
        };


        Thread t1=new Thread(r1,"T1");
        Thread t2=new Thread(r1,"T2");
        t1.start();
        t2.start();







    }
}
