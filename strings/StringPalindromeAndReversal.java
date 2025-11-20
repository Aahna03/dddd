import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Topic 3: Palindrome & Reversal
 *
 * Q6. Check if string is palindrome
 *    - Beginner: reverse string and compare.
 *    - Optimized: two pointers from both ends.
 *
 * Q7. Reverse words in a sentence
 *    - Beginner: split by spaces, reverse order.
 *    - Optimized: two pointers / stack for in-place style.
 */
public class StringPalindromeAndReversal {

    // Q6: Reverse and compare
    public static boolean isPalindromeReverseCompare(String s) {
        // TODO: build reversed string using StringBuilder and compare
        return false;
    }

    // Q6: Two-pointer approach
    public static boolean isPalindromeTwoPointers(String s) {
        // TODO: compare chars from ends while i < j
        return false;
    }

    // Q7: Reverse words using split
    public static String reverseWordsSplit(String sentence) {
        // TODO: split on spaces, reverse array, join back
        return "";
    }

    // Q7: Reverse words using stack / two pointers
    public static String reverseWordsStack(String sentence) {
        // TODO: push words onto stack, pop to build reversed sentence
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isPalindromeReverseCompare(input));
        sc.close();
    }
}


