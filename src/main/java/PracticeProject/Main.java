package PracticeProject;

public class Main {

    public static void main(String[] args) {

        Company company = new Company(666,"eCorp","135 East 57th Street", "ecorp666@gmail.com",2.252);

        Employee itDepartment = new Employee(123,"Jack","Network Administrator", 1677.7);
        Employee hrDepartment = new Employee (54,"Anne","Human Resourses",234.7);

        company.addEmployee(itDepartment);
        company.addEmployee(hrDepartment);


        Equipment desktops = new Equipment(665432221,"iMac", "PC");
        Equipment printers = new Equipment(112897897, "Xerox", "Printers");

        itDepartment.addEquipment(desktops);
        hrDepartment.addEquipment(printers);

        Apple a = new Apple(1,"Apple","Xegani kucesi","apple@gmail.com",2345.46);
        Employee softwareDev = new Employee(12,"Jacky","Software Developer", 1677.7);
        Employee dataAnalyst = new Employee (5,"An","Data Analyst",234.7);

        a.getNewEmployees(softwareDev);
        a.getNewEmployees(dataAnalyst);

        Samsung s = new Samsung(2,"Samsung","Tebriz kucesi", "samsung@gmail.com", 1234.4);

        Employee softwareDev2 = new Employee(1,"Kortney","Software Developer", 177.7);
        Employee dataAnalyst2 = new Employee (35,"Sam","Data Analyst",23.7);

        s.getNewEmployees(softwareDev2);
        s.getNewEmployees(dataAnalyst2);


    }

}
