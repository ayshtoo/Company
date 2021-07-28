package PracticeProject;

import java.util.ArrayList;

public class Apple extends Company{

    public Apple(int id, String name, String address, String email, double capital) {
        super(id, name, address, email, capital);
    }

    @Override
    public String OS() {
        return super.OS()+"IOS";
    }
}

