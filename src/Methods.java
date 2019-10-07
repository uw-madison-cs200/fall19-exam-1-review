/**
 * Methods
 * - Declaring & calling
 * - Returns & parameters
 * - Instance vs class (static) methods
 * - Variable scope
 * - Return values vs side effects
 * - Pass by value vs pass by reference
 */

/**
 * @author T.J.
 *
 */
public class Methods {
	/**
	 * This is a method header comment for the main method
	 * In this method, I'll call some methods to show examples
	 **/
	public static void main(String[] args) {
		// The name's Freddy Cool String!
		String freddyCoolString = "Freddy Coolman";
		String freddyChangedString = toLowerOrUpper(freddyCoolString, true);
		String freddyWimpString = toLowerOrUpper(freddyCoolString, false);
		
		String freddyNestedString = Methods.nest1(freddyChangedString);
		
		System.out.println(freddyCoolString);
		System.out.println(freddyChangedString);
		System.out.println(freddyWimpString);
		System.out.println(freddyNestedString);
	}

	/**
	 * Return the @input String as lowercase if {@code upper} is false, or uppercase if {@code upper} is true
	 * @param input The String to be case-converted
	 * @param upper Should case be upper or lower?
	 * @return the re-cased input
	 **/
	public static String toLowerOrUpper(String input, boolean upper) {
		if (upper) {
			return input.toUpperCase();
		}
		else {
			return input.toLowerCase();
		}
	}

	/**
	 * Does some nesting operations and returns the result
	 * @param name of a friend
	 * @return the nested transform of the name
	 */
	public static String nest1(String name) {
		System.out.println("Nest1 - 1 " + name);
		name = nest2(name + "'s toast");
		System.out.println("Nest1 - 2 " + name);
		System.out.println();

		return name;
	}
	/**
	 * Does more nesting stuff and returns the result
	 * @param toastBrand a brand of toast
	 * @return the nested transform of the name
	 */
	public static String nest2(String toastBrand) {
		System.out.println("\tNest2 - 1 " + toastBrand);
		return nest3(toastBrand + " and eggs");
		//System.out.println("\tNest2 - 2");
	}

	/**
	 * Finishes the nested operations and returns {@code meal} as entered
	 * @param meal a delicious meal
	 * @return the {@code meal} param passed in
	 */
	public static String nest3(String meal) {
		System.out.println("\t\tNest3 - 1 " + meal);
		return meal;
	}
}