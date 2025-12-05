import java.util.*;

/**
 * Topic 6: Duplicate Handling
 *
 * Q18. Remove Duplicates
 *    - Beginner: nested loops / extra array.
 *    - Optimized: HashSet (unsorted) OR two pointers (sorted).
 *
 * Q19. Find All Duplicate Elements
 *    - Beginner: nested loops.
 *    - Optimized: HashMap / frequency count.
 *
 * Q20. Find Frequency of Each Element
 *    - Beginner: nested loops.
 *    - Optimized: HashMap.
 */
public class DuplicateHandling {

    public static void removeDuplicates(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            boolean isDuplicate=false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDuplicate=true;
                    break;
                }

            }
            if(!isDuplicate)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void findAllDuplicate(int arr[]){
        int n=arr.length;
        int arr1[]=new int[n];
        int k=0;
        for(int i=0; i<n;i++){
            boolean isDuplicate=false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDuplicate=true;
                    break;
                }
            }
           if(!isDuplicate)
           {
            continue;
           }

           boolean isAlreadyPresent=false;

           for(int x=0;x<k;x++)
           {
            if(arr1[x]==arr[i])
            {
                isAlreadyPresent=true;
                break;
            }
           }
           if(!isAlreadyPresent)
           {
            arr1[k]=arr[i];
            k++;
           }
        }

        for(int i=0; i<k;i++){
            System.out.print(arr1[i]+" ");
        }
    }

    

    public static void main(String[] args){
        int arr[]={1,2,2,2,3,3,3,4,4,4,5,5,5,6};
        removeDuplicates(arr);
        findAllDuplicate(arr);
    }
}


