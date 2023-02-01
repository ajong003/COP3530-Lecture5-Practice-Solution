import java.util.*;

public class Problem1Tester {

	// Tester program that creates an ordered array list of comparable data
	// (dates) and adds 10 dates to the list.  This tester uses the
	// ArrayList class of the Java API.
	
	public static void main(String[] args) {
		
		boolean success;
		CalendarDate date;
		
		ArrayList<CalendarDate> list1 = new ArrayList<CalendarDate>();

		System.out.println("Inserting 10 different dates...\n");

		date = new CalendarDate(3, 16, 1978);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
	
		date = new CalendarDate(1, 25, 1984);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(6, 8, 2003);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(3, 12, 1942);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(8, 13, 1978);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(1, 28, 1984);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(4, 25, 1942);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(12, 8, 2003);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(10, 3, 2003);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");
		
		date = new CalendarDate(8, 14, 1978);
		System.out.println("Inserting " + date + "...");
		insert(list1, date);
		System.out.println("CURRENT ARRAYLIST:\n" + list1 + "\n");

	}

	// Inserts the given date into the list in chronological order.
	// Precondition: list is already sorted in chronological order.
	public static void insert(ArrayList<CalendarDate> list, CalendarDate date)
	{





	}

}
