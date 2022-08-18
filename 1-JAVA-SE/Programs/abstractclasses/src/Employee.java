public class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public  void processSalary(){}
    public static void display(Employee emp){
        System.out.println(emp);
        System.out.println("------------------------------");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
