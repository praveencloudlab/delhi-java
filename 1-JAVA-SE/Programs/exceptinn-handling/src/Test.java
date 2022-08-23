public class Test {
    public static void main(String[] args) {


        try{
            System.out.println(">>>>> 1. Line 1");
            System.out.println(">>>>> 2. Line 1");
            int x=10/0;
        }catch (Exception e){
            System.out.println(">>> Error occured");
            e.printStackTrace();
            System.out.println("Failed due to "+e);
        }


        System.out.println(">>>>> 3. Line 3");
        System.out.println(">>>>> 4. Line 4");


    }
}
