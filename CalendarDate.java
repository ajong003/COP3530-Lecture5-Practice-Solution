/**
 * Class to model a single calendar date with a month, day number, and year
 * @author tcortina
 */

public class CalendarDate implements Comparable<CalendarDate> {

	// This class implements Comparable so it must contain a
	// compareTo method as described in the Comparable interface
	
	private int month;
	private int day;
	private int year;

	/**
	 * Constructs a new calendar date.
	 * @param monthNumber The month number between 1 and 12 inclusive.
	 * @param dayNumber The day number between 1 and 31 inclusive.
	 * @param yearNumber The year number.
	 */
	public CalendarDate(int monthNumber, int dayNumber, int yearNumber)
	{
		// Assumes the supplied values are valid
		// BONUS EXERCISE: Modify this method so it outputs an error message
		// if the supplied date is invalid in any way and does not create a 
		// a new instance of this class
		
		month = monthNumber;
		day = dayNumber;
		year = yearNumber;		
	}

	/**
	 * Returns the month number of this calendar date.
	 * @return The month number.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Returns the day number of this calendar date.
	 * @return The day number.
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * Returns the year number of this calendar date.
	 * @return The year number.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Compares this calendar date to another calendar date for ordering
	 * based on the specification in the Comparable interface.
	 * @return A positive integer if this date is "greater" than the other date, 
	 * a negative integer if this date is "less" than the other date,
	 * or 0 if this date is equivalent to the other date.
	 */
	public int compareTo(CalendarDate otherDate) {
		if (this.year != otherDate.year)
			return this.year - otherDate.year;
		else if (this.month != otherDate.month)
			return this.month - otherDate.month;
		else
			return this.day - otherDate.day;
	}
	
	/**
	 * Overrides the equals method for the Object class. Returns true
	 * if this date is equivalent to another date supplied in the parameter.
	 */
	public boolean equals(Object obj) {
		CalendarDate otherDate = (CalendarDate) obj;
		return this.compareTo(otherDate) == 0;
	}
	
	/**
	 * Returns a hashcode for this date based on the month and day.
	 * @return The hashcode for this date.
	 */
	public int hashcode() {
		return month + day;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
}
