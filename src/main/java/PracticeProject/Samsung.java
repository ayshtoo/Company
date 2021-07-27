package PracticeProject;

public class Samsung extends Company{


    public Samsung(int id, String name, String address, String email, double capital) {
        super(id, name, address, email, capital);
    }
    public String OS(){
        return " Operating System is Android";
    }
public void getNewEmployees(Employee employee2){
    System.out.println("Employee of Samsung: " + employee2.toString());
}
}
