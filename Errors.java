import java.util.Scanner;

/**
 * 
 * @author trval
 *
 */
public class Errors {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Compiler error examples

		// num = 5;

		// int number = "number";

		// System.out.println("Is this okay?"):

		// System.out.println("what's wrong now?")

		// Runtime error examples
		// exampleOne();
		exampleTwo();
		// exampleThree();
	}

	/**
	 * First Example: What error will this produce?
	 */
	public static void exampleOne() {
		// Declare variables
		int numA = 30;
		int numB = 0;

		// What is wrong with this?
		int numC = numA / numB;
		System.out.println(numC);
	}

	/**
	 * Second Example: What error will this produce?
	 */
	public static void exampleTwo() {
		// Creating scanner variable called scnr
		Scanner scnr = new Scanner("hello 5");

		// What happens here?
		String line = scnr.nextLine();
		int num = Integer.parseInt(line);
	}

	/**
	 * Third Example: What error will this produce?
	 */
	public static void exampleThree() {
		// String variable
		Scanner scnr = null;
		scnr.nextLine();
	}
}
