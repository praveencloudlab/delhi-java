import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable, Comparator {
    private int empId;
    private String empName;
    private double salary;
    private LocalDate dob;

    public Employee(){}

    @Override
    public int compareTo(Object obj) {
        Employee emp=(Employee) obj;
        return empId-emp.getEmpId();
    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1=(Employee) o1;
        Employee emp2=(Employee) o2;
        return emp1.getEmpName().compareTo(emp2.getEmpName());
    }

    public Employee(int empId, String empName, double salary, LocalDate dob) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.dob = dob;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public  static void display(List<Employee> emps){
        System.out.println("========================================");
        System.out.println("EmpId\tEmpName\tSalary\tDOB");
        System.out.println("========================================");

        for(Employee emp:emps){
            System.out.print(emp.getEmpId()+"\t\t"+emp.getEmpName()+"\t\t"+emp.getSalary()+"\t"+emp.getDob());
            System.out.println();
        }
        System.out.println("========================================");



    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }
}
