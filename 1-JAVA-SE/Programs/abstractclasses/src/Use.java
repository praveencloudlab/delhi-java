public class Use {

    public static void main(String[] args) {


        Employee emp=new ContractEmployee(10,"Praveen",10);
        emp.processSalary();
        Employee.display(emp);

        emp=new RegularEmployee(11,"James",22);
        emp.processSalary();
        Employee.display(emp);

    }
}
