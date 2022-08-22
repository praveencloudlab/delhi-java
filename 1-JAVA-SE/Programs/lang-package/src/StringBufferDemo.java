public class StringBufferDemo {

    public static void main(String[] args) {

          StringBuffer sb=new StringBuffer("Abc");
        System.out.println("SB: "+sb);
        System.out.println("Hashcode: "+System.identityHashCode(sb));
        System.out.println(sb.hashCode());

        sb.append(" Xyz");

        System.out.println("--------------------------------------");
        System.out.println("SB: "+sb);
        System.out.println("Hashcode: "+System.identityHashCode(sb));
        System.out.println(sb.hashCode());

        sb.reverse();

        System.out.println("--------------------------------------");


        System.out.println("SB: "+sb);
        System.out.println("Hashcode: "+System.identityHashCode(sb));
        System.out.println(sb.hashCode());


    }
}
