package map;

import java.util.*;

public class MapTest
{
    public static void main(String[] args)
    {
	Map<String, Employee> staff = new HashMap<>();
	staff.put("144-25-5446", new Employee("Amy Lee"));
	staff.put("567-24-2546", new Employee("Harry Hacker"));
	staff.put("157-62-5527", new Employee("Gary Cooper"));
	staff.put("456-62-5527", new Employee("Francesca Gruz"));

	System.out.println(staff);

	staff.remove("567-24-2546");

	staff.put("456-62-5527", new Employee("Francesca Miller"));

	System.out.println(staff.get("157-62-5527"));

	for (Map.Entry<String, Employee> entry : staff.entrySet()) {
	    String key = entry.getKey();
	    Employee value = entry.getValue();
	    System.out.println("key=" + key + ", value=" + value);
	}
    }
}
