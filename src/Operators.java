/**
 * Basic operators & Order of operations
 *
 * @author T.J.
 */
public class Operators {
    public static void main(String[] args) {
        // Example 1
        int num1 = 2 * 10 - 5 * 3; // 20 - 15
        int num2 = 2 * (10 - 5) * 3; // 2 * 5 * 3
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);

        // Example 2
        int a = 10;
        int b = a + (a = 2);
        // b = 10 + 2; (a = 2)
        System.out.println("a " + a);
        System.out.println("b " + b);

        // Example 3
        int c = 10;
        int d = (c = 2) + c;
        // d = 2 + 2; (c = 2)
        System.out.println("c " + c);
        System.out.println("d " + d);

        // Example 4
        int e = 2;
        int f = e + (e = (e + 3));
        // f = 2 + (2 + 3); (e = 5)
        System.out.println("e " + e);
        System.out.println("f " + f);

        // Example 5
        a = 5;
        int i = ++a + ++a;
        //=> i= 6 + 7; (a=7)
        System.out.println("a " + a);
        System.out.println("i " + i);

        a = 5;
        i = a++ + ++a;
        //=> i=5 + 7; (a=7)
        System.out.println("a " + a);
        System.out.println("i " + i);

        // Example 6
        int g = 5;
        int h = g++ + (g = g - 2);
        // => h = 5 + (6 - 2); (g = 4)
        System.out.println("g " + g);
        System.out.println("h " + h);

    }
}
