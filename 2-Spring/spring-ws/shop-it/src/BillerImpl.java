//Dependent
public class BillerImpl {

    /*

       Issues
       ========================

       --> too many dependency object  creations
            -> memory management is problem
            -> per of application goes down

        why this issue happened?
        ===========================
        -->  dependent class itself creating object  of dependency class directly

        what is the solution?
        ========================
        -> dont create dependency object in the dependent class
        -> instead, use any look up techniques like JNDI
        -> JNDI location  is tightly coupled with  dependent class.

        What is the best solution?
        ==================================

        -> Do not crete, or search, instead, ask some one (container) to inject/pass : (IoC : inversioon of control)

        How to implement IoC?
        =========================
        -> by implementing dependency injection mechanism.

        what is dependency injection (DI)
        -------------------------------------
        -> injecting/passing dependency object to the dependent object is called DI

        how/ how many ways DI can be implemented? : 2 ways
        ----------------------------------------------------
        way 1: setter based injection
        way 2: constructor based injection

        way 1: setter based injection : rules
        ---------------------------------------
        1. create dependency object referance at class level.
        2. generate/create setters for above defined referance.











     */

    private PriceMatrix price;

    public void setPrice(PriceMatrix price) {
        this.price = price;
    }

    public double getCartTotal(String[] cart){

        double total=0.0;
       // PriceMatrixImpl price=new PriceMatrixImpl();

        for(String itemCode:cart){
            total=total+price.getItemPrice(itemCode);
        }
        return total;
    }
}
