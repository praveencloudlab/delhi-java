class  Abc{ }
class Xyz extends Abc{ }
public class UncheckedException {

    public static void main(String[] args) {

        System.out.println(">>> main");
        //Abc a=new Xyz();

        Xyz x=(Xyz)new Abc();



    }
}
