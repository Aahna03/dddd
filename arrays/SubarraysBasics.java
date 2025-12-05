
/**
 * Topic 7: Subarray & Subsequence
 *
 * Q21. Print All Subarrays
 *    - Beginner: use two/three nested loops.
 *
 * Q22. Maximum Subarray Sum
 *    - Implement brute force version here, optimized in MaximumSubarray.java.
 *
 * Q23. Subarray with Given Sum
 *    - Beginner: brute force all subarrays.
 *    - Optimized: Prefix Sum / HashMap (or two pointers for positives).
 */
public class SubarraysBasics {

   public static void printAllSubArrays(int arr[]){
   int n=arr.length;
   for(int i=0;i<n;i++)
   {
    for(int j=i;j<n;j++)
    {
        for(int k=i;k<=j;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
   }
   }

   public static void maxSubArraySum(int arr[]){
    int n=arr.length;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
     
        for(int j=i;j<n;j++){
            int currentSum=0;
            for(int k=i;k<=j;k++)
            {
                currentSum+=arr[k];
            }
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }
        }}
        System.out.println("Maximum Subarray Sum: "+maxSum);
    }

    public static void subArrayWithGivenSum(int arr[], int targetSum){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int currentSum=0;
            for(int j=i;j<n;j++){
                currentSum+=arr[j];
                if(currentSum==targetSum)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();   
                    return;
                }
            }
        }
    }

   public static void main(String[] args){
    int arr[]={1,2,3};
    printAllSubArrays(arr);
    maxSubArraySum(arr);
    subArrayWithGivenSum(arr, 5);
   }
}


