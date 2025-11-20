
/**
 * Topic 2: Searching
 *
 * Q6. Linear Search (unsorted)
 *    - Beginner: simple scan.
 *
 * Q7. Binary Search (sorted)
 *    - Standard iterative binary search.
 *
 * Q8. First and Last Occurrence
 *    - Beginner: linear scan.
 *    - Optimized: binary search variation to find first and last indices.
 */
public class LinearBinarySearch {

    //Q6.- Linear Search 
    public static void LinearSearch(int arr[], int target)
    {
        int flag =0;
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]==target){
                flag = 1;
                break;
            }
        }

        if(flag==1){
        System.out.println("Target found in the array");
        }
        else 
        {
            System.out.println("Target not found in the array");
        }

        }


    //Q7. Binary Search
    public static void BinarySearch(int arr[], int target){
        int low=0;
        int high= arr.length-1;
        int flag=0;

        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                flag=1;
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                high= mid-1;
            }
        }

        if(flag==1){
            System.out.println("Target found in the array");
        }
        else {
            System.out.println("Target not found in the array");
        }
    }


    //Q8. First and Last Occurrence- Beginner Approach: Linear Scan
    public static void FirstLastOccurrence(int arr[], int target){
        int first= -1;
        int last= -1;
        for(int i =0 ; i<arr.length; i++){
           if(arr[i]==target){ if(first==-1)
            {first=i;}
            else {last=i;}}
           
        }

        System.out.println("First occurrence at index: " +first);
        System.out.println("Last occurrence at index: " +last);
    }

     public static void main(String[ ] args) {
        int arr[] = {4,2,3,3,3,5,7,8};
        int arr2[] = {2,3,4,5,7,8,9,10,12};
        int target = 3;
        LinearSearch(arr, target);
        BinarySearch(arr2, target);
        FirstLastOccurrence(arr, target);
    }

 
    }
    
  



