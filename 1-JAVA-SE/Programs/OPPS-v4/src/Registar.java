public class Registar {

    // singleton design pattern

    // provide private constructor to disable default constructor
    private Registar(){

    }

    private static Registar registar;

    public static Registar getRegister(){

        if(registar==null){
            registar=new Registar();
        }

       return registar;
    }


    public void registerStudent(Student s){

    }

}
