public class StringDemo {

    public static void main(String[] args) {

        String s1="Abc";


        System.out.println("S1: "+s1);
        System.out.println("Hashcoode S1: "+s1.hashCode());
        System.out.println("Identity Hashcode S1: "+System.identityHashCode(s1));


        String s2=new String("Abc");


        System.out.println("S2: "+s2);
        System.out.println("Hashcoode S2: "+s2.hashCode());
        System.out.println("Identity Hashcode S2: "+System.identityHashCode(s2));

        if(s1.equals(s2)){ // == always compares hash codes
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }





    }

}
