/**
 * Branching / Conditionals
 *
 * @author Turner
 *
 */
public class Branching {

	public static void main(String[] args) {
		//exampleOne();
		exampleTwo();
		//exampleThree();
		//exampleFour();
	}

	/**
	 * First example: explaining booleans
	 */
	public static void exampleOne() {
		// Declaring a boolean variable.
		boolean example = true;

		// What will example become?
		example = example == false;
		System.out.println(example);

		// What will example become?
		example = example == false;
		System.out.println(example);
	}

	/**
	 * Second example: More Comparisons and boolean operators
	 */
	public static void exampleTwo() {
		// Declare a boolean variable
		boolean example = false;

		// What will example become?
		example = example && true;
		System.out.println(example);

		// What will example become?
		example = example || true;
		System.out.println(example);

		// What will example become?
		example = !example;
		System.out.println(example);

		// Bringing it all together, what will example become?
		example = true;
		example = ((!(!example)) && (true && example) && (!example || false));
		System.out.println(example);
	}

	/**
	 * Third example: Basic If/Else and Switch
	 */
	public static void exampleThree() {
		// Declare a boolean variable
		boolean example = true;

		// 1
		if (!example) {
			System.out.println("Hello!");
		} else {
			System.out.println("Goodbye!");
		}

		// 2
		// Declaring variables
		int dayNum = 6;
		String dayString;

		switch (dayNum) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "INVALID";
			break;
		}
		System.out.println(dayString);
	}
	
	/**
	 * Fourth Example: Bringing it all together. 
	 */
	public static void exampleFour() {
		//1
		int dayNum = 1;
		String dayString = "Monday.";
		if (!(dayNum == 1) || (dayString.equals("Monday"))) {
			System.out.println("The day is Monday.");
		} 
		else {
			System.out.println("The day is not Monday");
		}
		
		//2
		boolean example = true;
		
		if (!(!(!(example)))) {
			System.out.println("1");
		}
		else if (((example == true) && (example)) && (false || !example)) {
			System.out.println("2");
		}
		else if (false || !(!(example))) {
			System.out.println("3");
		}
		else {
			System.out.println("4");
		}
	}

}
