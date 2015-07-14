package pair3;

import java.util.*;

public class Employee
{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String inName, double inSalary, int year, int month, int day)
    {
        name = inName;
	salary = inSalary;
	GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
	hireDay = calendar.getTime();
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public Date getHireDay() { return hireDay; }
}
