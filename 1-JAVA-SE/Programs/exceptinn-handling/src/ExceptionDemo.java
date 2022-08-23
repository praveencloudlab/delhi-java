import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;

        while (flag)
        try {
            System.out.println("Input a Number: ");
            int x=Integer.parseInt(br.readLine());
            //int x = sc.nextInt();
            //sc.nextLine();
            System.out.println("Number is " + x);
            flag=false;
        }catch (Exception e){
            System.out.println("Invalid Input. try again...");
        }
       }
}
