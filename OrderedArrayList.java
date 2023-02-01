@SuppressWarnings("unchecked")

public class OrderedArrayList<T extends Comparable<T>> {
	
	// An ordered array consists of a collection of objects 
	// of some type T that is comparable to itself
	// (i.e. has a compareTo method to compare objects of type T)

	private T[] dataArray;
	private int numData;

	/**
	 * Creates an empty ordered array list of comparable entries of the same type
	 */
	public OrderedArrayList() {
		dataArray =  (T[]) new Comparable[1];
		numData = 0;
	}

	/**
	 * Adds the new entry into this ordered array list. If the entry is not in the
	 * list, the entry is added so that the list remains ordered in increasing order
	 * and returns true. If the entry is already in the list, the list is not changed
	 * and false is returned.
	 * @param newEntry The new data item to be inserted into this ordered array list.
	 * @return true if the array list is changed, false if not
	 */
	public boolean add(T newEntry) {








		return true;		
	}

	public String toString() {
		String result = "";
		result += "numData = " + numData + ", dataArray.length = " + dataArray.length + "\n";
		for (int i = 0; i < numData; i++)
			result += "dataArray[" + i + "] = " + dataArray[i] + "\n";
		return result;
	}
	
	private void reallocate() {
		T[] newArray = (T[]) new Comparable[dataArray.length*2];
		System.arraycopy(dataArray, 0, newArray, 0, dataArray.length);
		dataArray = newArray;
	}

	
}
