import java.util.HashSet;
import java.util.LinkedHashSet;

public class HahSetDemo {

    public static void main(String[] args) {


        LinkedHashSet<Object> hs=new LinkedHashSet<>();
        hs.add("Abc");
        hs.add(3472343);
        hs.add("Abc");
        hs.add(3645f);
        hs.add('A');

        System.out.println(hs.size());

        System.out.println(hs);

        // find
        boolean flag=false;
        for(Object obj:hs){
            if(obj.equals("Abckkh")){
                flag=true;
            }
        }
        if (flag){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }




    }
}
