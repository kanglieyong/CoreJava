import com.kly.corejava.*;

import static java.lang.System.*;

public class PackageTest
{
    public static void main(String[] args)
    {
	Employee harry = new Employee("Harry Hacker", 50000, 1988, 3, 26);

	harry.raiseSalary(5);

	out.println("name = " + harry.getName() + ", salary = " + harry.getSalary() + ", hireDay = " + harry.getHireDay());
    }
}
