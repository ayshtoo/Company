package PracticeProject;

public class Main {

    public static void main(String[] args) {

        Company company = new Company(666,"eCorp","135 East 57th Street", "ecorp666@gmail.com",2.252);

        Apple a = new Apple(1,"Apple","Xegani kucesi","apple.com",2345.46);
        SoftwareDev sd = new SoftwareDev(12,"Kate","Software Developer", 12.456, 128);

        a.addEmployee(sd);

        Samsung s = new Samsung(2,"Samsung","Tebriz kucesi", "samsung.com", 1234.4);
        DataAnalyst da = new DataAnalyst(31, "Jack", "Data Analyst",9.456, 234);

        s.addEmployee(da);

        System.out.println("Employee of an Apple: " + a.getEmployees().get(0) + a.OS());
        System.out.println("Employee of Samsung: " + s.getEmployees().get(0) + s.OS());

    }

}
