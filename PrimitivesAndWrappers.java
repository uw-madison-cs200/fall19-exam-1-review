import java.util.Scanner;

public class PrimitivesAndWrappers {

	public static void main(String[] args) {
		// List the primitive data types. Where are these stored in memory?

		// What is a reference variable and how are they stored in memory?

		exampleOne();
		exampleTwo();

	}

	/**
	 * First Example: Autoboxing versus autounboxing
	 */
	public static void exampleOne() {
		// Is this auto boxing or auto unboxing?
		int numA = 100;
		Integer refNum = numA; // auto boxing (?)

		
		// Is this auto boxing or auto unboxing?
		Integer reference = new Integer(5);
		int primitive = reference;

		// What about chars?
		Scanner scnr = new Scanner("Madison Wisconsin");
		String city = scnr.next();
		char stateAbrv = scnr.next().charAt(0);
		System.out.println(city + " " + stateAbrv);

	}

	/**
	 * Second Example: Comparisons of primitives and references.
	 */
	public static void exampleTwo() {
		// What is happening here?
		Scanner input = new Scanner("Wisconsin");
		String state = "Wisconsin";
		String inputState = input.next();
		if (state == inputState) {
			System.out.println("ON WISCONSIN");
		} else {
			System.out.println("GO BADGERS");
		}

		// Comparisons with numbers
		Integer inum = new Integer(10);
		Integer inumB = new Integer(10);

		if (inum == inumB) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}

	}
}
