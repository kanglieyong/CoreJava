package priorityQueue;

import java.util.*;

public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
	pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9));
	pq.add(new GregorianCalendar(1840, Calendar.NOVEMBER, 10));
	pq.add(new GregorianCalendar(1973, Calendar.JUNE, 23));
	pq.add(new GregorianCalendar(1823, Calendar.JULY, 10));

	System.out.println("Iterating over elements...");
	for (GregorianCalendar date : pq) {
	    System.out.println(date.get(Calendar.YEAR));
	}
	System.out.println("Removing elements...");
	while (!pq.isEmpty()) {
	    System.out.println(pq.remove().get(Calendar.YEAR));
	}
    }
}
