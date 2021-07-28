package PracticeProject;

public class Samsung extends Company{


    public Samsung(int id, String name, String address, String email, double capital) {
        super(id, name, address, email, capital);
    }

    @Override
    public String OS() {
        return super.OS()+ "Android";
    }
}

