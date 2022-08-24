import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class ArrayLisstDemo {
    public static void main(String[] args) {


        List<Object> ar=new ArrayList<>();
        ar.add("Abc");
        ar.add("James");
        ar.add(8473);
        ar.add(847.43f);
        ar.add('H');

        // iterate
        /*
        4 ways
        ------------
        way 1: for each
        way 2: Iterator interface
        way 3: ListIteratior interface
        way 4: Enumerator interface (synchronied)




         */

        // 1. foor each

        /*
        for(Object obj:ar){
            ar.add("Bla");
            System.out.println(obj);
        }

         */


        // 2. Iterator

        Iterator<Object> it=ar.iterator();

        while(it.hasNext()){
            Object obj=it.next();
            if(obj.equals("Abc")){
                //ar.remove(obj);
                it.remove();

            }
            System.out.println(obj);
        }

        System.out.println("---------------");
        System.out.println(ar);

        System.out.println("=========================");

        // 3. ListIterator

        ListIterator<Object> li=ar.listIterator();

        while(li.hasNext()){
            Object obj=li.next();
            if(obj.equals("James")){
                li.set("Bucky Wall");
            }
            System.out.println(obj);
        }

        System.out.println("=========================");
        System.out.println(ar);








    }


}
