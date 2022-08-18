import java.io.PrintStream;

public class Account {
    {
        System.out.println("instance block1");
    }
    static {
        System.out.println("Block-1");
    }

    static {
        System.out.println("Block-2");
    }

    Account(){
        System.out.println("Account Default constructor");
    }
    void f1(){
        new Bank().f1();
        System.out.println(">>> f1 method");
    }
    public static void main(String[] args) {
        System.out.println("main method");
         PrintStream ps= System.out;
         ps.println(">>>> Different technique");
        new Account().f1();
        Bank.f2();
        new Bank().f1();

    }
}
