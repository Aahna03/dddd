import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Topic: Intermediate Sorting Concepts
 *
 * Q4. Sorting Stability Concept
 *    - Beginner: run different algorithms on data with duplicates and observe output.
 *    - Optimized: know which sorts are stable and how to preserve stability.
 *
 * Q5. Sorting in Descending / Custom Order
 *    - Beginner: reverse loops or negate values to mimic descending.
 *    - Optimized: use comparators / custom lambdas.
 */
public class IntermediateSortingConcepts {

    // Q4: Helper method to demonstrate stability
    public static List<String> bubbleSortStabilityDemo(List<String> items) {
        // TODO: implement bubble/selection and observe whether duplicates keep relative order
        return new ArrayList<>(items);
    }

    // Q5: Sort integers descending manually
    public static void sortDescendingManual(int[] arr) {
        // TODO: adapt bubble/selection to enforce descending order
    }

    // Q5: Sort strings using custom comparator (optimized)
    public static void sortWithComparator(List<String> items, Comparator<String> comparator) {
        // TODO: call items.sort(comparator);
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 8, 2};
        sortDescendingManual(nums);
        System.out.println(Arrays.toString(nums));
    }
}


