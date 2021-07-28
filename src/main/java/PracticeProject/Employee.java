package PracticeProject;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Employee  {
    private final int id;
    private final String name;
    private String position;
    private double salary;
    private int bonus;


    private ArrayList<Equipment> equipments = new ArrayList<>();

    public Employee(int id, String name, String position, double salary, int bonus) {
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
    public void setBonus(Integer bonus){
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

    public boolean addBonus(){
        boolean hasBonus = false;

        if (bonus > 0) {
            hasBonus = true;
        }
        return hasBonus;
    }

    @Override
    public String toString() {
        return
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", position='" + this.position + '\'' +
                ", salary=" + this.salary + ", bonus= " + this.bonus + ", ";
    }
}
