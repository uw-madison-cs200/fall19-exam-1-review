import java.util.Scanner;
/*
 * @author Ray & Bobbi
 */
//charAt, substring, length, equals, toUpperCase, toLowerCase, \", \\
public class StringMath {
	public static void main (String args[]) {
		//String immutability
		String myString = "Hello";
		myString.toUpperCase();
		System.out.println("First: " + myString);
		
		
		String string2 = new String("Hello");
		//equal?
		System.out.println("Are the strings equal?");
		System.out.println("String == is " + (myString == string2));
		System.out.println("String .equals() is " + myString.equals(string2));

		System.out.println();
		String string3 = "QwErTy";
		System.out.println(string3.substring(2).toUpperCase().toLowerCase());
		System.out.println(string3.substring(1,4).substring(1,2));

		
		//Math methods
		int x = 5;
		Integer y = new Integer(5);
		Integer z = 5;
		System.out.println();
		System.out.println("z == x is " + (z == x));
		System.out.println();
		System.out.println("z == y is " + (z == y));
		System.out.println();
		System.out.println("x == y is " + (x == y));
		

		//static examples
		foo(z); //calling directly
		Math.min(5, 10); //calling with a ClassName.methodName()
		
		//non static examples;
		Scanner scnr = new Scanner("Hello 123");
		String str1 = "something else";
		scnr.nextLine();
		str1.toUpperCase(); //what are the instances in these method calls?
		
		
	}
	public static int foo(int num) {
		return num;
	}
}