public class StringTester {

        // Tester program that creates an ordered array list of comparable data
        // (city names) and adds 10 city names to the list.  Uses a 
	// custom designed array list that keeps its elements in order.    	
	public static void main(String[] args) {
		
		boolean success;
		String city;
		
		OrderedArrayList<String> list1 = new OrderedArrayList<String>();
		
		System.out.println("Inserting 10 different cities...");

		city = new String("Pittsburgh");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Atlanta");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("New York City");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Denver");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Los Angeles");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Seattle");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Dallas");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Boston");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Chicago");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		city = new String("Washington DC");
		success = list1.add(city);
		if (success)
			System.out.println("Inserted " + city);

		System.out.println("\n" + list1);
		
		System.out.println("Trying to insert Seattle again...");
		city = new String("Seattle");
		success = list1.add(city);
		if (!success)
			System.out.println("NOT INSERTED - DUPLICATE");
		
		System.out.println(list1);
		
	}

}
