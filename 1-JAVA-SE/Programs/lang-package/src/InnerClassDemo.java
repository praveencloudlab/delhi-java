class Bank{
    LockerAccess la=new LockerAccess();
    class CashFlow{

        void f1(){
            la.access();
            System.out.println("CashFlow f1 inner class method");
        }
    }

    static class CardOperation{
        void f2(){
            System.out.println("CardOperation f2 static  inner class method");

        }
    }

    private class LockerAccess{
        void access(){
            System.out.println(">>>> access  given for locker");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {

        Bank b=new Bank();
        Bank.CashFlow cf = b.new CashFlow();
        cf.f1();

       Bank.CardOperation cp=new Bank.CardOperation();
       cp.f2();
       

    }
}
