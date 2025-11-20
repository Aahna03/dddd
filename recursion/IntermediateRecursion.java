import java.util.Scanner;

/**
 * Topic: Intermediate Recursion
 *
 * Q4. Sum of digits / Reverse number
 *    - Beginner: recursively process last digit (n % 10).
 *    - Optimized: pay attention to digit extraction efficiency / tail recursion.
 *
 * Q5. Tower of Hanoi
 *    - Beginner: follow the 3-step rule (from -> aux, from -> to, aux -> to).
 *    - Optimized: understand minimal moves (2^n - 1) and pattern.
 */
public class IntermediateRecursion {

    // Q4: Sum of digits
    public static int sumOfDigits(int n) {
        // TODO: base case when n == 0
        return 0;
    }

    // Q4: Reverse number using recursion
    public static int reverseNumber(int n) {
        // TODO: helper to build reversed number
        return 0;
    }

    // Helper for reverse
    private static int reverseHelper(int n, int result) {
        // TODO: accumulate digits and return final reversed value
        return 0;
    }

    // Q5: Tower of Hanoi - print moves
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // TODO: base case n == 0; else move n-1 to aux, move largest to toRod, move n-1 from aux to toRod
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
        sc.close();
    }
}


