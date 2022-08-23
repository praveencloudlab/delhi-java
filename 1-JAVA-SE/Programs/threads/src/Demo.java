public class Demo implements  Runnable{

    @Override
    public void run() {
        f1();
    }

    void f1(){
        System.out.println("f1=> "+Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            System.out.println("I= "+i+" by "+Thread.currentThread().getName());

        }
    }


    public static void main(String[] args) {


        Demo d=new Demo();

        Thread t1=new Thread(d,"First Thread");
        Thread t2=new Thread(d,"Second Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start(); // run method
        t2.start();
       // d.f1();
        //d.f2();

        System.out.println(Thread.currentThread().getName());


    }
}
