import java.time.LocalDate;

public class Student {



    private int id;
    private String name;
    private int age;
    private LocalDate dob;

    public Student(int id, String name, int age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public void registerStudent(){
        System.out.println(">>>> ============= <<<<");
        System.out.println(this);
        System.out.println(">>>> ============= <<<<");

        Registar r1= Registar.getRegister();
        Registar r2= Registar.getRegister();
        Registar r3= Registar.getRegister();


        System.out.println("r1 Hashcode: "+r1.hashCode());
        System.out.println("r2 Hashcode: "+r2.hashCode());
        System.out.println("r3 Hashcode: "+r3.hashCode());

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
