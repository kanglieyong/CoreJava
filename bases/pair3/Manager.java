package pair3;

public class Manager extends Employee
{
    private double bonus;

    public Manager(String inName, double inSalary, int year, int month, int day)
    {
        super(inName, inSalary, year, month, day);
	bonus = 0;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double newValue) { bonus = newValue; }

    public double getSalary() {
        double baseSalary = super.getSalary();
	return baseSalary + bonus;
    }
}
