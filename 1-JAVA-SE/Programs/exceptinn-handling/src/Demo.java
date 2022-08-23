class A{

}
public class Demo {
    public static void main(String[] args) {
        try{

            System.out.println(">>> Try");

            String a="Abc";
            int num=Integer.parseInt(a);

            //System.out.println(obj);
            int y=19/0;

            int x[]=new int[1];
            x[3]=98;

        } catch (ArithmeticException ae){
            System.out.println(">>>> Catch "+ae);
        }catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println(">>> Failed due to "+aiob);
        }catch (NumberFormatException nfe){
            System.out.println(">>> Failed due to "+nfe);
        }
        finally {
            System.out.println(">>> Finally always get executed");
        }

    }
}


/*
    -> try must be followed by either catch or finally

 */
