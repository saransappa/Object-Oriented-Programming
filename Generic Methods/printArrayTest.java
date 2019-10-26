package genericMethods;

public class printArrayTest {
	public static void main(String [] args) {
		Integer [] intarray = new Integer[5];
		intarray[0] = new Integer(1);
		intarray[1] = new Integer(2);
		intarray[2] = new Integer(3);
		intarray[3] = new Integer(4);
		intarray[4] = new Integer(5);
		
		Double [] doublearray = new Double[5];
		doublearray[0] = new Double(6.1);
		doublearray[1] = new Double(5.693);
		doublearray[2] = new Double(2.36987);
		doublearray[3] = new Double(8.98);
		doublearray[4] = new Double(75.2);
		
		
		printArray.printAnyArray(intarray);
		printArray.printAnyArray(doublearray);
		
	}
}	
