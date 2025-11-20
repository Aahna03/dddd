import java.util.Scanner;

/**
 * Topic 1: Basics
 *
 * Q1. Count vowels, consonants, digits, and spaces.
 *    - Beginner: iterate and update counters manually.
 *    - Optimized: regex / built-in helpers (Java: use Character class or regex).
 *
 * Q2. Convert string to uppercase / lowercase / toggle case.
 *    - Beginner: manual ASCII checks.
 *    - Optimized: String methods like .toUpperCase().
 *
 * Q3. Find length without using built-in functions.
 *    - Beginner: loop until end.
 *    - Optimized: use .length().
 */
public class StringBasics {

    public static class Counts {
        public int vowels;
        public int consonants;
        public int digits;
        public int spaces;
    }

    // Q1: Beginner counting
    public static Counts countCharactersManual(String s) {
        // TODO: iterate char by char, update counts, return result
        return new Counts();
    }

    // Q1: Optimized using regex / built-in
    public static Counts countCharactersRegex(String s) {
        // TODO: use regex or Character utility methods to count categories
        return new Counts();
    }

    // Q2: Manual uppercase / lowercase / toggle
    public static String toUpperManual(String s) {
        // TODO: convert using ASCII math (if 'a' <= ch <= 'z', subtract 32)
        return "";
    }

    public static String toLowerManual(String s) {
        // TODO: convert manual uppercase to lowercase
        return "";
    }

    public static String toggleCaseManual(String s) {
        // TODO: swap case for letters manually
        return "";
    }

    // Q2: Optimized conversions
    public static String toUpperBuiltIn(String s) {
        return s.toUpperCase();
    }

    public static String toLowerBuiltIn(String s) {
        return s.toLowerCase();
    }

    public static String toggleCaseUsingBuilder(String s) {
        // TODO: use StringBuilder and Character methods for cleaner approach
        return "";
    }

    // Q3: Length without built-in
    public static int lengthManual(String s) {
        // TODO: loop until end and count
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Manual upper: " + toUpperManual(input));
        System.out.println("Built-in upper: " + toUpperBuiltIn(input));

        sc.close();
    }
}


