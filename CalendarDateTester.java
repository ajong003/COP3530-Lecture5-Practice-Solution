public class CalendarDateTester {

	// Tester program that creates an ordered array list of comparable data
	// (dates) and adds 10 dates to the list.  Uses a custom designed
	// array list that keeps its elements in order.
	
	public static void main(String[] args) {
		
		boolean success;
		CalendarDate date;
		
		OrderedArrayList<CalendarDate> list1 = new OrderedArrayList<CalendarDate>();

		System.out.println("Inserting 10 different dates...");

		date = new CalendarDate(3, 16, 1978);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
	
		date = new CalendarDate(1, 25, 1984);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(6, 8, 2003);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(3, 12, 1942);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(8, 13, 1978);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(1, 28, 1984);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(4, 25, 1942);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(12, 8, 2003);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(10, 3, 2003);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);
		
		date = new CalendarDate(8, 14, 1978);
		success = list1.add(date);
		if (success)
			System.out.println("Inserted " + date);

		System.out.println("\n" + list1);

		System.out.println("Trying to insert 1/28/1984 again...");
		date = new CalendarDate(1, 28, 1984);
		success = list1.add(date);
		if (!success)
			System.out.println("NOT INSERTED - DUPLICATE");
		
		System.out.println(list1);
		
	}

}
