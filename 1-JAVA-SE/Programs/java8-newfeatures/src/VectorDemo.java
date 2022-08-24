import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Stack<Object> ar=new Stack<>();

        ar.add("Abc");
        ar.add(198734);
        ar.add('H');
        ar.add(false);
        ar.add(198734);
        ar.add(8684.43f);

        System.out.println(ar.size());

        System.out.println(ar);
        System.out.println(ar.get(2));
        System.out.println("-------------------");
        for(Object obj:ar){
            System.out.println(obj);
        }
        // delete element
        ar.remove(2);
        System.out.println(ar);

        // find elemennt
        boolean flag=false;

        for (Object obj:ar){
            if(obj.equals("Abcjhjdh")){
                flag=true;
            }
        }

        if(flag){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

    }
}
