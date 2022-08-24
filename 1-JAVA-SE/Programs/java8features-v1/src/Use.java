import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Use {

    public static void main(String[] args) {

        Employee e1=new Employee(56,"Rgh",18000, LocalDate.of(1990,6,28));
        Employee e2=new Employee(45,"Khg",19000, LocalDate.of(1989,2,12));
        Employee e3=new Employee(18,"Akj",15000, LocalDate.of(1992,5,18));
        Employee e4=new Employee(12,"Huk",12000, LocalDate.of(1992,1,22));
        Employee e5=new Employee(52,"Bfd",20000, LocalDate.of(1990,6,12));


        List<Employee> emps=new ArrayList<>();

        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        emps.add(e5);

        //System.out.println(emps);
        System.out.println("ORIGINAL DATA");
        Employee.display(emps);


      //Comparator<Employee> sbn=  (emp1,emp2)->emp1.getEmpName().compareTo(emp2.getEmpName());
      //Comparator<Employee> sbs=  (emp1,emp2)-> (int) ((int) emp1.getSalary() - emp2.getSalary());

        System.out.println("SORT BY EMP ID");
        Collections.sort(emps); // objects in the emps collection must emplementy either Comparable oor Comparator
        Employee.display(emps);

        System.out.println("SORT BY EMP NAME");
        Collections.sort(emps,new Employee()); // objects in the emps collection must emplementy either Comparable oor Comparator
        Employee.display(emps);

        System.out.println("SORT BY EMP SALARY");
        Collections.sort(emps,new SortBySalary()); // objects in the emps collection must emplementy either Comparable oor Comparator
        Employee.display(emps);

        System.out.println("SORT BY EMP DOB");
        Collections.sort(emps,new SoortByDOB()); // objects in the emps collection must emplementy either Comparable oor Comparator
        Employee.display(emps);

    }
}

class SortBySalary implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (int) (emp1.getSalary()-emp2.getSalary());
    }
}

class SoortByDOB implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getDob().compareTo(emp2.getDob());
    }
}
