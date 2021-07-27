package PracticeProject;

import java.util.ArrayList;

public class Apple extends Company{

    public Apple(int id, String name, String address, String email, double capital) {
        super(id, name, address, email, capital);
    }

    public String OS(){
        return "Operating System is IOS";
    }

    public void getNewEmployees(Employee employee1) {
        System.out.println("Employee of an Apple: " + employee1.toString());
    }
}
