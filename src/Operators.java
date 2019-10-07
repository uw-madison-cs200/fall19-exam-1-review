/**
 * Basic operators & Order of operations
 *
 * @author T.J.
 */
public class Operators {
    public static void main(String[] args) {
        // Example 1
        int a = 2 * 10 - 5 * 3; // 20 - 15
        int b = 2 * (10 - 5) * 3; // 2 * 5 * 3
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();

        // Example 2
        // a = 10;
        // b = a + (a = 2);
        // // b = 10 + 2; (a = 2)
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
        // System.out.println();

        // Example 3
        // a = 10;
        // b = (a = 2) + a;
        // // b = 2 + 2; (a = 2)
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
        // System.out.println();

        // Example 4
        // a = 10;
        // b = a + (a *= 2);
        // // b = 10 + 20; (a = 20)
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
        // System.out.println();

        // Example 5
        // a = 2;
        // b = a + (a = (a + 3));
        // // b = 2 + (2 + 3); (a = 5)
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
        // System.out.println();

        // Example 6
        // String c = 5 - 5 - 5 + "x" + 5 + 4;
        // System.out.println("c: " + c);
        // System.out.println();

        // Example 7
        // a = 10;
        // a %= 3; // a = a % 3
        // System.out.println("a: " + a);
        // System.out.println();

        // Example 8
        // a = 10;
        // b = 3;
        // int c = a / b;
        // int d = a % b;
        // int e = a % b + b * (a / b); // d + (b * c)
        // System.out.println("c: " + c);
        // System.out.println("d: " + d);
        // System.out.println("e: " + e);
    }
}
