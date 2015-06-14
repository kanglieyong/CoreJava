public class PrintDay
{
    public static void main(String[] args)
    {
	printDay("Monday");
	printDay("Wednessday");
    }

    public static void printDay(String dayOfWeek)
    {
	switch (dayOfWeek) {
	case "Sunday" :    System.out.println("Dimanche"); break;
	case "Monday" :    System.out.println("Dimanche"); break;
	case "Tuesday" :   System.out.println("Dimanche"); break;
	case "Wednesday" : System.out.println("Dimanche"); break;
	case "Thursday" :  System.out.println("Dimanche"); break;
	case "Friday" :    System.out.println("Dimanche"); break;
	case "Saturday" :  System.out.println("Dimanche"); break;
	default:           System.out.println("Error: " + dayOfWeek + " is not a day of the week"); break;
	}
    }
}
