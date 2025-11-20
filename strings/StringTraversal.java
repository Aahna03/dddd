import java.util.Scanner;

/**
 * Topic 2: Traversal & Character Operations
 *
 * Q4. Print all characters with their ASCII values.
 *    - Beginner: simple loop and cast to int.
 *    - Optimized: use streams / helper method returning formatted string.
 *
 * Q5. Remove whitespaces or special characters from string.
 *    - Beginner: build output by skipping undesired chars.
 *    - Optimized: regex (e.g., replaceAll) or Character checks.
 */
public class StringTraversal {

    // Q4: Beginner
    public static void printCharsWithAscii(String s) {
        // TODO: loop i from 0..n-1 and print s.charAt(i) + " -> " + (int)s.charAt(i)
    }

    // Q4: Optimized (return formatted string)
    public static String charsWithAsciiFormatted(String s) {
        // TODO: use StringBuilder to build "c(ASCII)" pairs separated by spaces
        return "";
    }

    // Q5: Remove whitespaces / special characters (manual)
    public static String removeWhitespaceManual(String s) {
        // TODO: build StringBuilder, skip if Character.isWhitespace
        return "";
    }

    // Q5: Remove special characters (keep letters/digits)
    public static String removeSpecialManual(String s) {
        // TODO: manual filter for alphanumeric characters
        return "";
    }

    // Q5: Regex versions
    public static String removeWhitespaceRegex(String s) {
        // TODO: use s.replaceAll("\\s+", "")
        return "";
    }

    public static String keepAlphanumericRegex(String s) {
        // TODO: keep [A-Za-z0-9] and remove others using regex
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
    }
}


