import java.util.Map;
import java.util.Scanner;

/**
 * Topic: Recursion Basics
 *
 * Q1. Print numbers 1 to N
 *    - Beginner: simple recursive prints (increasing/decreasing).
 *    - Optimized: discuss tail recursion.
 *
 * Q2. Factorial / Fibonacci
 *    - Beginner: direct recursion, visualize tree.
 *    - Optimized: memoization for Fibonacci.
 *
 * Q3. Power (x^n)
 *    - Beginner: multiply x recursively n times.
 *    - Optimized: fast power / binary exponentiation.
 */
public class RecursionBasics {

    // Q1: print 1..n recursively
    public static void printIncreasing(int n) {
        // TODO: base case and recursive call
    }

    public static void printDecreasing(int n) {
        // TODO: print n down to 1 recursively
    }

    // Tail-recursive version placeholder (Java doesn’t optimize tail recursion but good to illustrate)
    public static void printIncreasingTail(int current, int n) {
        // TODO: tail recursion style
    }

    // Q2: Factorial
    public static long factorial(int n) {
        // TODO: base case 0!/1! = 1, else n * factorial(n-1)
        return 1L;
    }

    // Q2: Fibonacci naive
    public static long fibonacci(int n) {
        // TODO: fib(0)=0, fib(1)=1
        return 0L;
    }

    // Q2: Fibonacci memoized
    public static long fibonacciMemo(int n, Map<Integer, Long> memo) {
        // TODO: store results in memo map
        return 0L;
    }

    // Q3: Power naive
    public static long powerNaive(long x, int n) {
        // TODO: multiply x recursively n times
        return 1L;
    }

    // Q3: Power fast (binary exponentiation)
    public static long powerFast(long x, int n) {
        // TODO: use divide & conquer on exponent
        return 1L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        printDecreasing(n);
        sc.close();
    }
}


