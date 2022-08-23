import java.util.Arrays;

public class UserDefinedCheckedException {

    public static void main(String[] args){

        String[] hotels={"H1","H2","H3","H4","H5"};
        String key="H22";
        boolean flag=false;

            try {
                for (String hotelName : hotels) {
                    if (hotelName.equals(key)) {
                        flag = true;
                    }
                }

                if (flag) {
                    System.out.println("Hotel Found");
                } else {
                    throw new NoSuchHotelFoundException("No Hotel  Found with given Key");
                    // System.out.println("Hotel Not  Found");
                }
            }catch (NoSuchHotelFoundException e) {
                System.out.println("Issue "+e);
            }



    }
}
