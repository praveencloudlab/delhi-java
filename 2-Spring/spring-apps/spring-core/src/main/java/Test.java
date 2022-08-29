import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {



    public static void main(String[] args) {


        // load spring xml file (configuuratin file)

        System.out.println(">>> main <<<");

        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("spring.xml");

        /*
        //Employee e=(Employee) context.getBean("emp");
        Employee e= context.getBean("emp1",Employee.class);
        e.f1();

         */
        Employee e1= context.getBean("e1",Employee.class);
        Employee e2= context.getBean("e1",Employee.class);
        Employee e3= context.getBean("e1",Employee.class);

        e1.f1();
        e2.f1();
        e3.f1();

        //Employee e2= context.getBean("emp1",Employee.class);


        // Student s= context.getBean("s1",Student.class);


    }
}
