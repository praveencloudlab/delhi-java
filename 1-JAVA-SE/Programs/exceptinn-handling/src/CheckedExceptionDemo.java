import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

    public static void main(String[] args)throws Exception {

        try {
            FileInputStream fis = new FileInputStream("abc.txt");
        }catch (Exception e){

        }


    }
}
