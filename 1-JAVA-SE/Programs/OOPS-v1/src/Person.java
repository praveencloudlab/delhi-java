public class Person {
    int id;
    String name;
    int age;
    final String COUNTRY="India";
    static final String MANAGER="Rajeev";

    void inputPerson(){
        id=10;
        name="James";
        age=76;
    }

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+COUNTRY);
        System.out.println("Manager: "+MANAGER);
    }

    public static void main(String[] args) {
        Person p1=new Person();
        p1.inputPerson();
        p1.display();

    }

}
