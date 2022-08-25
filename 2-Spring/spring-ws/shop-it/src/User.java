public class User {

    public static void main(String[] args) {

        String cart1[]={"I01","I02","I03"};
        String cart2[]={"I01","I02"};


        PriceMatrix price=new PriceMatrixImpl(); // dependency

        //=======================================
        BillerImpl biller=new BillerImpl(); // dependent
        //=======================================

        biller.setPrice(price);// passing / injecting dependency (price) to the dependent (biller) is called DI:

       double total=  biller.getCartTotal(cart1);

        System.out.println("Cart1 Total: "+total);

        total=  biller.getCartTotal(cart2);
        System.out.println("Cart2 Total: "+total);



    }
}
