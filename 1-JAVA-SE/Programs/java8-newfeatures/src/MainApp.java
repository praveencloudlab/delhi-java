import com.sun.tools.javac.Main;

public class MainApp {

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

    public static void main(String[] args) {

        MainApp ma=new MainApp();
        ma.f1(34f);

    }
}
