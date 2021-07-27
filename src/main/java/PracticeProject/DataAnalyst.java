package PracticeProject;

public class DataAnalyst extends Employee{
    public DataAnalyst(int id, String name, String position, double salary, int bonus) {
        super(id, name, position, salary, bonus);
    }

    @Override
    public int addBonus() {
        return super.addBonus();
    }
}
