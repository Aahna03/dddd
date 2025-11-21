
/**
 * Topic 5: Sorting & Order
 *
 * Q14. Bubble Sort
 *    - Beginner: basic nested loops.
 *    - Optimized: stop early if no swaps in an inner pass.
 *
 * Q15. Selection Sort
 *    - Beginner: find min in unsorted part and swap.
 *
 * Q16. Insertion Sort
 *    - Beginner: insert each element into sorted prefix.
 */
public class BasicSorting {

    //Q14. Bubble Sort
    public static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort(arr);
    }}
   



