import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Class Name: ");
        String s1=sc.nextLine();
        System.out.println(s1);

       // s1 ss=new s1();

        // How many ways  object can be created  : 3 ways
        // 1. new keyword
        // 2. factory method (new instance)
        // 3. clone

        Class clName= Class.forName(s1);
        System.out.println(clName);

       Object obj=clName.newInstance(); // create objects

        if(obj instanceof Animal){
            Animal a=(Animal) obj;
            a.f1();
        }

        if(obj instanceof Human){
            Human h=(Human) obj;
            h.f2();
        }




    }
}
