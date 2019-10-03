/**
 * Scanner
 * - using a method with if statements to scan a string with whitespace
 * - using nextLine() and next() together
 *
 * @author T.J.
 */

import java.util.Scanner;

public class ScannerExamples {
	
	public static void main(String[] args) {
		
		/*
		 * Example 1: using a method to read a string with different types
		 */
		
		// Java whitespace characters: \t, \n, \f, \r, other rarely used unicode characters
		String methodRead = "firstWord 40 50\r 3.0 word1\n string \t\n";
		//Scanner scnr = new Scanner(methodRead);
		/*
		readNextToken(scnr);		
		readNextToken(scnr);
		readNextToken(scnr);
		readNextToken(scnr);
		readNextToken(scnr);
		readNextToken(scnr);
		*/
		//if(scnr.hasNextLine()) {
			System.out.println("There was a next line!");
		//}
		//System.out.println();
		
		// can a scnr.next() call ever return a String with whitespace?
		
		
		
		
		
		/*
		 * Example 2: using next() together with nextLine() 
		 */
		
		
		String someNumbers = "3 2 1 liftoff\n3 astronauts aboard";
		
		Scanner scnr = new Scanner(someNumbers);
		
		if(scnr.hasNextDouble()) {
			System.out.println(scnr.nextDouble());
		}
		else if(scnr.hasNextInt()) {
			System.out.println(scnr.nextInt());
		}
		else {
			System.out.println(scnr.nextLine());
		}
		
		System.out.println(scnr.nextLine());		// will this print out whitespace at the beginning of the String?
		
		System.out.println(scnr.next());
		scnr.nextLine();							// consuming the rest of the input
		scnr.next();								// if we try to scan after everything has been consumed
		System.out.println();
		
		
		
	}
	/*
	
	private static void readNextToken(Scanner s) {
		
		if(s.hasNextDouble()) {
			System.out.println("double read: " + s.nextDouble());
		}
		else if (s.hasNextInt()) {
			System.out.println("int read: " + s.nextInt());
		}
		else if (s.hasNext()) {
			System.out.println("String read: " + s.next());
		}
		else {
			System.out.println("error: nothing to read");
		}
		
	}
	
*/
	
	
	
	
	
	// Fixed version of readNextToken()...checks types in the correct order
	
	// Show how nextDouble and nextInt can be changed for different hasNext__() methods
	private static void readNextToken(Scanner s) {
		
		if(s.hasNextInt()) {
			System.out.println("int read: " + s.nextInt());
		}
		else if (s.hasNextDouble()) {
			System.out.println("double read: " + s.nextDouble());
		}
		else if (s.hasNext()) {
			System.out.println("String read: " + s.next());
		}
		else {
			System.out.println("error: nothing to read");
		}
		
	}
	
	


}
