import java.util.Scanner;

/**
 * Topic 1: Traversal & Basics
 *
 * Q1. Input and Print an Array
 *    - Beginner: simple for-loop to read and print.
 *
 * Q2. Find Maximum and Minimum Element
 *    - Beginner: scan array once and track max/min.
 *
 * Q3. Calculate Sum and Average of Array Elements
 *    - Beginner: sum elements, divide by length for average.
 *
 * Q4. Count Occurrences of an Element
 *    - Beginner: loop and count matches.
 *
 * Use the main method here to test each function.
 */
public class ArrayBasics {

    // Q1: Input and Print an Array
    public static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }

    //Q2: find maximum and minimum element
    public static void findMax(int[] arr) {
        int max= arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }

        System.out.println("Maximum element is: "+max);
        System.out.println("Minimum element is:"+min);

    }

    //Q3: Calculate sum and average of array elements
    public static void calculateSum(int[] arr) {
        int sum=0 ; int avg=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];

        }
        avg = sum/(arr.length);
        System.out.println("Sum of array elements is:"+sum);
        System.out.println("Average of array elements is:"+avg);
    }

    //Q4: Count occurences of an element
    public static void countOccurences(int[] arr, int target) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) {
                count++;
            }
        }
        System.out.println("Occurences of " +target+ " "+"is:"+count);
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 4, 4, 5};
        printArray(arr);
        findMax(arr);
        calculateSum(arr);
        countOccurences(arr, 4);
    }




}


