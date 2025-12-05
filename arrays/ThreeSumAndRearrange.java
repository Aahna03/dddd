import java.util.*;

/**
 * Topic 8: Two Pointers Technique
 *
 * Q27. Triplet with Given Sum (3-sum)
 *    - Beginner: triple nested loops.
 *    - Optimized: sort + two pointers inside one loop.
 *
 * Q28. Move Zeroes to End
 *    - Beginner: build new array and then copy back.
 *    - Optimized: two pointers / partition.
 *
 * Q29. Segregate Positive & Negative
 *    - Beginner: extra array.
 *    - Optimized: two-pointer partition (like partition step of quicksort).
 */
public class ThreeSumAndRearrange {

  //three sum using brute force 
  public static void ThreeSumUsingBruteForce(int arr[], int target)
  {
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(target==arr[i]+arr[j]+arr[k]){
                    System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    break;
                }
            }
        }
    }
  }

  public static void ThreeSumUsingTwoPointers(int arr[], int target){
    int n=arr.length;
    for(int i=0;i<n;i++){
        int start = i+1;
        int end = n-1;
        while(start<end){
            int sum = arr[i]+arr[start]+arr[end];
            if(sum==target){
                System.out.println(arr[i]+","+arr[start]+","+arr[end]);
                break;
            }
            else if(sum<target){
                start++;
            }
            else end--;
        }
    }
  }

  public static void main(String args[]){
    int arr[]={1,2,5,6,7,8};
    int target= 21;
    ThreeSumUsingBruteForce(arr, target);
    ThreeSumUsingTwoPointers(arr, target);
  }
}


