public class PersonV2 {
    int id;
    String name;
    int age;
    final String COUNTRY="India";
    static final String MANAGER="Rajeev";

    void inputPerson(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    static void display(PersonV2 p){
        System.out.println("ID: "+p.id);
        System.out.println("Name: "+p.name);
        System.out.println("Age: "+p.age);
        System.out.println("Country: "+p.COUNTRY);
        System.out.println("Manager: "+MANAGER);
    }

    public static void main(String[] args) {
        PersonV2 p1=new PersonV2();
        PersonV2 p2=new PersonV2();


        p1.inputPerson(10,"Sana",34);
        display(p1);

        p2.inputPerson(11,"James",87);
        display(p2);

    }

}
