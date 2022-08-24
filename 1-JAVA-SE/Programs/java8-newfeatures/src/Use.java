public class Use {

    public static void main(String[] args) {

        MyInter mi1=new Test();
        mi1.f1();

        MyInter mi=new MyInter() {
            @Override
            public void f1() {
                System.out.println(">> Hello F1");
            }

        };

        mi.f1();


    }
}
