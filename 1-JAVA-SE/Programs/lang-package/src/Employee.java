public class Employee {

    private int empId;
    private String empName;
    private double salary;

    @Override
    public int hashCode() {
        return 98989898;
    }

    @Override
    public boolean equals(Object obj) {
        Employee empObj=(Employee) obj;

        if(empId==empObj.empId && empName.equals(empObj.getEmpName())&&salary==empObj.getSalary()){
            return true;
        }
        return false;

    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
