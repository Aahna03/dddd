
/**
 * Problem: Rotate Array
 *
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 *
 * Try:
 * 1. Extra array solution (O(n) time, O(n) space)
 * 2. In-place reversal solution (O(n) time, O(1) extra space)
 */
public class RotateArray {
  
    //Q11. Rotate array by one step (Left rotation)
    public static void RotateByone(int arr[]) {
        int first = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]= first;
        
        for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);

        }
    }


    //Q11. Rotate array by one step (Right rotation)
    public static void RotateByOneRight(int arr[]){
        int last = arr[arr.length-1];
       
        for(int i=arr.length-1;i>=1;i--)
        {
            arr[i]=arr[i-1];
        }

        arr[0]=last;
         for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);

        }

    }

    //Q12. Rotate an element by k steps
    public static void RotateArrayByKSteps(int arr[], int target)
    {
        int k= target % arr.length;
        while(k>0)

        {
           int first = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]= first;
        
            k--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
      
    }

    public static void main(String[] args){
        int arr[]= {1,2,3,4,5,6,7};
        int target= 5;
        RotateByone(arr);
        RotateByOneRight(arr);
        RotateArrayByKSteps(arr, target);
    }

}


