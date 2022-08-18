public class PersonV1 {
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

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+COUNTRY);
        System.out.println("Manager: "+MANAGER);
    }

    public static void main(String[] args) {
        PersonV1 p1=new PersonV1();
        PersonV1 p2=new PersonV1();


        p1.inputPerson(10,"Ozvitha",34);
        p1.display();

        p2.inputPerson(11,"Bucky Wall",87);
        p2.display();

    }

}
