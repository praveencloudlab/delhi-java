public class Test {

    public static void main(String[] args) {
        Department dept=new Department();
        dept.setDeptId(1024);
        dept.setDeptName("HR");
        dept.setLocation("Delhi");

        Employee emp=new Employee(87,dept);


        //emp.setEmployeeId(10);
        emp.setEmployeeName("James");
        emp.setSalary(846584);

        //emp.setDept(dept);
        //System.out.println(emp.toString());
        Employee.display(emp);
    }
}
