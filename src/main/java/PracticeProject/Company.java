package PracticeProject;

import java.util.ArrayList;


public class Company {
    private final int id;
    private final String name, address, email;
    private double capital;
    private  ArrayList<Employee> employees = new ArrayList<>();


    public Company(int id, String name, String address, String email, double capital) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.capital = capital;
    }

    public int getId(){
        return id;
    }
    public String getName(){

        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public Double getCapital(){
        return capital;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee e){
        this.employees.add(e);
    }
    public void addEmployees(ArrayList<Employee> employees){
        this.employees.addAll(employees);
    }

    public String OS() {
            return ("Operating System of a company is: ");
        }
    }

