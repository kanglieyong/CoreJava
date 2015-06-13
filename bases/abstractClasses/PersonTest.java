package abstractClasses;

public class PersonTest
{
    public static void main(String[] args)
    {
	Person[] people = new Person[2];

	people[0] = new Employee("Carl Hacker", 45000, 1987, 10, 23);
	people[1] = new Student("KLY", "Mathematica");

	for (Person p : people) {
	    System.out.println(p.getName() + ", " + p.getDescription());
	}
    }
}
