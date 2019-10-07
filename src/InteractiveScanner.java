/**
 * THIS IS NOT REQUIRED MATERIAL!!!
 * This is a helper class, only for helping to explain Scanners.
 * It uses Lists/ArrayLists and enums which you haven't learned and are
 * not required to know for this exam, so don't worry about ANYTHING in this
 * class or file.
 */

import java.util.*;

// Only supports next(), nextInt(), nextDouble(), and nextLine()
enum TokenType
{
    STRING, INT, DOUBLE, LINE
}

// Interactive Scanner is a special Scanner which you can step forward
// or backwards in to better understand the mechanisms.
public class InteractiveScanner
{
    private String source;
    private Scanner scanner;
    private List<TokenType> tokensRead;
    private int index;

    /**
     * If you want to read anything from this file, just look at this method.
     * It interactively scans through the input passed into the InteractiveScanner
     * by reading lines from the user and interpretting them as "(n)ext",
     * "next(I)nt", "next(D)ouble", "next(L)ine", "(B)ack", or "(S)top"
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        InteractiveScanner scnr = new InteractiveScanner("hello world\t 8.0\t\n 999\n\nlol");
        while (true)
        {
            System.out.println("Scanner state:");
            System.out.println("-------------------------------------");
            System.out.println(scnr);
            System.out.println("-------------------------------------");

            String line = input.nextLine().trim().toLowerCase(); // Normalize the next line
            System.out.println(); // Padding

            try
            {
                if (line.equals("n"))
                    System.out.println("Read: \"" + scnr.next() + "\"");
                else if (line.equals("i"))
                    System.out.println("Read: " + scnr.nextInt());
                else if (line.equals("d"))
                    System.out.println("Read: " + scnr.nextDouble());
                else if (line.equals("l"))
                    System.out.println("Read: \"" + scnr.nextLine() + "\"");
                else if (line.equals("b")) {
                    System.out.println("Going back to previous state...");
                    scnr.back();
                }
                else if (line.equals("s"))
                    break;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("InputMismatchException!");
            }
        }

        input.close();
    }


    public InteractiveScanner(String source)
    {
        this.source = source;
        scanner = new Scanner(source);
        index = -1;
        tokensRead = new ArrayList<TokenType>();
    }

    public void back()
    {
        tokensRead.remove(0);
        List<TokenType> oldTokens = tokensRead;
        tokensRead = new ArrayList<TokenType>();
        buildScanner(oldTokens);
    }

    /**
     * Return a String version of this Scanner where
     * the the current position is indicated by a single '|'
     */
    public String toString()
    {
        String ret = "";
        if (index != -1)
            ret += source.substring(0, Math.min(index, source.length()));
        ret += "|";
        if (index < source.length())
        {
            if (index == -1)
                ret += source;
            else
                ret += source.substring(index);
        }

        return ret;
    }

    private void buildScanner(List<TokenType> tokensRead)
    {
        scanner = new Scanner(source);
        index = -1;

        for (int i = tokensRead.size()-1; i >= 0; i--)
        {
            TokenType type = tokensRead.get(i);
            readByType(type); // Don't need the result
        }
    }

    // Read a single token from the scanner by that type and return it as a String
    private String readByType(TokenType type)
    {
        switch(type)
        {
            case STRING:
                return next();
            case INT:
                return "" + nextInt();
            case DOUBLE:
                return "" + nextDouble();
            case LINE:
                return nextLine();
            default:
                return "";
        }
    }

    ////// Below this is handling the typical Scanner methods
    ////// BUT we keep track of the token types we read & their positions

    public String next()
    {
        String nextToken = scanner.next();
        tokensRead.add(0, TokenType.STRING);
        index = source.indexOf(nextToken, index) + nextToken.length();
        return nextToken;
    }

    public int nextInt()
    {
        int val = scanner.nextInt();
        tokensRead.add(0, TokenType.INT);
        String nextToken = "" + val;
        index = source.indexOf(nextToken, index) + nextToken.length();
        return val;
    }

    public double nextDouble()
    {
        // Here we have to specially handle both integers and decimal numbers
        boolean wasInt = scanner.hasNextInt();
        double val = scanner.nextDouble();
        tokensRead.add(0, TokenType.DOUBLE);
        String nextToken = "";
        if (wasInt)
            nextToken += (int)val;
        else
            nextToken += val;

        index = source.indexOf(nextToken, index) + nextToken.length();
        return val;
    }

    public String nextLine()
    {
        String nextToken = scanner.nextLine();
        tokensRead.add(0, TokenType.LINE);
        index = source.indexOf(nextToken, index) + nextToken.length() + 1; // For the newline
        return nextToken;
    }

    public boolean hasNext() { return scanner.hasNext(); }
    public boolean hasNextInt() { return scanner.hasNextInt(); }
    public boolean hasNextDouble() { return scanner.hasNextDouble(); }
    public boolean hasNextLine() { return scanner.hasNextLine(); }

}
