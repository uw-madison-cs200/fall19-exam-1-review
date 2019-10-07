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

    // Example 1

    // Main whitespace characters: \t, \n, spaces
    String methodRead = "firstWord 40 50 3.0 word1\n string \t\n";
    Scanner scnr = new Scanner(methodRead);
    if (scnr.hasNextLine()) {
      System.out.println("There is a next line!");
    }
    if (!scnr.hasNextInt()) {
      System.out.println("The next token is not an int!");
    }
    System.out.println("The next token was: \"" + scnr.next() + "\"");
    System.out.println();

    // can a scnr.next() call ever return a String with whitespace?

    /*
     * Example 2: using next() together with nextLine()
     */
    String someNumbers = "3 2 1 liftoff\n3 astronauts aboard";

    // Here we use a special "Interactive" Scanner which has the ability
    // to print out the current state of the Scanner as a String
    InteractiveScanner iScnr = new InteractiveScanner(someNumbers);
    printInteractiveScanner(iScnr);

    if(iScnr.hasNextDouble()) {
      System.out.println("Read double: " + iScnr.nextDouble());
    }
    else if(iScnr.hasNextInt()) {
      System.out.println("Read int: " + iScnr.nextInt());
    }
    else {
      System.out.println("Read line: " + iScnr.nextLine());
    }

    printInteractiveScanner(iScnr); // Print the state of the InteractiveScanner

    // Will this print out whitespace at the beginning of the String?
    System.out.println("Read line: " + iScnr.nextLine());
    printInteractiveScanner(iScnr);

    System.out.println("Read token: " + iScnr.next());
    printInteractiveScanner(iScnr);

    System.out.println("Read line: " + iScnr.nextLine()); // consuming the rest of the input
    printInteractiveScanner(iScnr);
    iScnr.next(); // if we try to scan after everything has been consumed
  }

  public static void printInteractiveScanner(InteractiveScanner scnr)
  {
        System.out.println("Scanner state:");
        System.out.println("-------------------------------------");
        System.out.println(scnr);
        System.out.println("-------------------------------------");
        System.out.println();
  }
}
