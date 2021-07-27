package PracticeProject;

import java.util.ArrayList;

public class Employee  {
    private final int id;
    private final String name;
    private String position;
    private double salary;
    private float bonus;


    private ArrayList<Equipment> equipments = new ArrayList<>();

    public Employee(int id, String name, String position, double salary, float bonus) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary =salary;
        this.bonus = bonus;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public float getBonus(){
        return bonus;
    }
    public void setBonus(Float bonus){
        this.bonus = bonus;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void addEquipment(Equipment eq){
        this.equipments.add(eq);
    }
    public void addEquipments(ArrayList<Equipment> equipments){
        this.equipments.addAll(equipments);
    }

    public  void addBonus(){
        boolean hasBonus = false;

        if (bonus >0) {
            hasBonus = true;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", position='" + this.position + '\'' +
                ", salary=" + this.salary +
                '}';
    }
}
