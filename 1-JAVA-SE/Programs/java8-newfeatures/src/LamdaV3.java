public class LamdaV3 {
    public static void main(String[] args) {

        /*
        Shape s=(int x)->{
            System.out.println("X: "+x);
        };

         */

       // Shape s=(int x)-> System.out.println(x);
        Shape s=(x)-> System.out.println(x);
        s.draw(43);

    }
}
