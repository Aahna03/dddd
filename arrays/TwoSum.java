import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem: Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 *
 * Try:
 * 1. Brute force solution (O(n^2))
 * 2. Optimized solution using a HashMap (O(n))
 */
public class TwoSum {

  //Doing using brute force
  public static void TwoSumUsingBruteForce(int arr[], int target){
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
           if(arr[i]+arr[j]==target)
           {
            System.out.println(arr[i]+","+arr[j]);
            return;
           }
        }
    }
  }

  //Doing two sum using two pointers
  //notes: array needs to be sorted
  public static void TwoSumUsingTwoPointers(int arr[], int target){
     int start=0;
     int end=arr.length-1;
     while(start<end)
     {
        int sum = arr[start]+arr[end];
        if(sum==target){
            System.out.println(arr[start]+","+arr[end]);
            break;
        }
        else if(sum<target){
            start++;
        }
        else end--;
     }
     
  }

  public static void main(String args[]){
    int arr[]= {2,6,7,11};
    int target= 9;
    TwoSumUsingBruteForce(arr, target);
    TwoSumUsingTwoPointers(arr, target);
  }
}


