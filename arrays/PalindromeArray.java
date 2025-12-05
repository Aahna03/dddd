
/**
 * Topic 1 (continued) & Topic 8: Two Pointers
 *
 * Q5. Check if Array is Palindrome
 *    - Beginner: Reverse & Compare
 *    - Optimized: Two Pointers
 */

//Beginner Approach: Reverse and Compare
public class PalindromeArray {

    public static void Palindrome(int arr[]){
        int arr2[] = new int[arr.length];
        int flag= 0;
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            arr2[j]= arr[i];
            j++;
        }

        for(int i=0; i<arr.length;i++){
            if(arr[i]==arr2[i]){
                continue;
            }
            else {
                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("The array is not a palindrome");
        }
        else {
            System.out.println("The array is a palindrome");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        Palindrome(arr);
    }
}



