package PracticeProject;

public class DataAnalyst extends Employee{
    public DataAnalyst(int id, String name, String position, double salary, float bonus) {
        super(id, name, position, salary, bonus);
    }

    @Override
    public void addBonus() {
        super.addBonus();
    }
}
