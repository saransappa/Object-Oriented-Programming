import java.util.Scanner;

public class ReadConsole {

  public static void main (String[] args)  {
    
    Scanner scanner = new Scanner(System.in); // create a Scanner instance

    System.out.print("Enter a string: ");	// prompt for a String
    String varString = scanner.next();		// read the string

    System.out.print("Enter an int: ");	// prompt for an integer
    int varInt = scanner.nextInt();		// read an integer

    System.out.print("Enter a float: ");	// prompt for an float
    float varFloat = scanner.nextFloat();		// read a float

    System.out.println("varString, varInt, varFloat = " 
    					+ varString + "\t"
    					+ varInt + "\t"
    					+ varFloat);
    
    String line;
    if (scanner.hasNext())				// Check if input exists
      line = scanner.nextLine();	// If so, read the entire next line

    while (scanner.hasNext())        // As long as input exists
      line = scanner.nextLine(); // read the next line
  }
}
