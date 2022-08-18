public class Bank implements Customer, BankEmployee, Manager {

    @Override
    public void deposit(double amt){
        System.out.println(">> Depositing");
    }
    @Override
    public void withDraw(double amt){
        System.out.println(">> withdrawing");
    }

    @Override
    public void openAccount(){
        System.out.println(">>> account opening");
    }


    @Override
    public void enableNetBanking(){
        System.out.println(">> Netbanking is enabled");
    }


}
