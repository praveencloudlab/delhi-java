// POJO : plain old java object
// how can a class can be fully encapsulated?

public class Employee {

    Employee(int employeeId,Department dept){
        this.employeeId=employeeId;
        this.dept=dept;
    }

    private int employeeId;
    private String employeeName;
    private double salary;

    private  Department dept;


    // getters and setters


    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        //
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static  void display(Employee emp){
        System.out.println("ID: "+emp.getEmployeeId());
        System.out.println("Name: "+emp.getEmployeeName());
        System.out.println("Salary: "+emp.getSalary());
        System.out.println("Dept ID: "+emp.getDept().getDeptId());
        System.out.println("Dept Name: "+emp.getDept().getDeptName());
        System.out.println("Location: "+emp.getDept().getLocation());

        System.out.println("========================================");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
