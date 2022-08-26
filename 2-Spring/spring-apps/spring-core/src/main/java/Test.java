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
        Employee e= context.getBean("emp1",Employee.class);
    }
}
