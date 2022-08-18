public class RegularEmployee extends Employee{
    private int noOfDaysWorked;

    public RegularEmployee(int empId, String name, int noOfDaysWorked) {
        super(empId, name);
        this.noOfDaysWorked = noOfDaysWorked;
    }


   @Override
    public void processSalary() {
        setSalary(noOfDaysWorked*12000);
    }


}
