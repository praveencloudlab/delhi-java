public class EnuumDemo<T> {

     void addMenu(T itemName){
        System.out.println(">>>> Item  "+itemName+" is added..");
    }
    public static void main(String[] args) {
         EnuumDemo<Enum> obj=new EnuumDemo<>();
           obj.addMenu(Menu.POORI);
          // obj.addMenu("BLA BLA");

    }
}
