package inheritance;

public class ManagerTest
{
    public static void main(String[] args)
    {
	Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
	boss.setBonus(5000);

	Employee[] staff = new Employee[3];

	staff[0] = boss;
	staff[1] = new Employee("Harry Hacker", 50000, 1986, 12, 1);
	staff[2] = new Employee("Tommy Tester", 40000, 1988, 5, 12);

	for (Employee e : staff) {
	    System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay = " + e.getHireDay());
	}
    }
}
