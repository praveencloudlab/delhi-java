// Dependency
public class PriceMatrixImpl implements PriceMatrix {

    PriceMatrixImpl(){
        System.out.println(">> PriceMatrixImpl object created.....");
    }

    @Override
    public double getItemPrice(String itemCode){
        // code to connect to DB and fetch price of a given itemCode
        return 100.00;
    }


}
