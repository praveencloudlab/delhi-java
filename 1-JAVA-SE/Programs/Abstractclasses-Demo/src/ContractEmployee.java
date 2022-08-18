public class ContractEmployee extends  Employee{

    private int noOfHours;
    public ContractEmployee(int empId, String name,int noOfHours) {
        super(empId, name);
        this.noOfHours=noOfHours;
    }



    @Override
    public void processSalary() {
        setSalary(noOfHours*4500);
    }

}
