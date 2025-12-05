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

    //Q24: Reverse and array using two pointers
    public static void reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    //Q25: Palindrome array using two pointers
    public static void palindromeArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("The array is not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("The array is a palindrome");
    }



    public static void main(String[] args){
        int arr[]={1,2,3,2,1};
        reverseArray(arr);
        palindromeArray(arr);
    }


}


