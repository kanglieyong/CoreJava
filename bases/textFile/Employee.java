package textFile;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee
{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
	this.name = name;
	this.salary = salary;
	GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireDay = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return hireDay;
    }

    public String toString()
    {
	return getClass().getName() + "[name = " + name + ", salary = " + salary + ", hireDay = " + hireDay +  "]";
    }

    public static void main(String[] args)
    {
	Employee a = new Employee("Toster", 75000, 1982, 12, 4);
	System.out.println(a);
    }
}
