
/**
 * Topic 3 & 8: Reversal + Two Pointers
 *
 * Q9. Reverse an Array
 *    - Beginner: create new array and copy from end.
 *    - Optimized: in-place two-pointer swap.
 *
 * Q10. Reverse a Subarray [l, r]
 *    - Optimized: two-pointer swap between l and r.
 */
public class ReverseArray {

   //Q9. Reverse an Array- Begginer approach
   public static void reverse(int arr[]){
        int arr2[]= new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            arr2[j]=arr[i];
            j++;

        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr2[i]+" ");
        }
   }

   //Q10. Reverse a subarray [l, r]- Two Pointer approach
   public static void SubarrayReverse(int arr[], int l, int r){
    for(int i=l; i<r; i++){
        int temp= arr[i];
        arr[i]= arr[r];
        arr[r]= temp;
        r--;
    }
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
   }

   public static void main(String[] args){
        int arr[]= {0,1,2,4,5,6,7,8,9};
        int l=2;
        int r=6;
        reverse(arr);
        SubarrayReverse(arr, l, r);
   }
}


