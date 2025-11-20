import java.util.Scanner;

/**
 * Topic 12: Matrix as 2D Arrays
 *
 * Q40. Spiral Traversal
 *    - Beginner: simulate boundaries (top, bottom, left, right).
 *
 * Q41. Rotate Matrix by 90°
 *    - Beginner: create new matrix and map indices.
 *    - Optimized: transpose + reverse rows (in-place for square matrix).
 *
 * Q42. Search in a Sorted 2D Matrix
 *    - Beginner: brute force (scan all cells).
 *    - Optimized: "staircase search" from top-right or bottom-left.
 */
public class MatrixProblems {

    // Q40: Spiral traversal of matrix
    public static void spiralTraversal(int[][] matrix) {
        // TODO: print elements in spiral order using boundaries
    }

    // Q41: Rotate matrix 90 degrees clockwise (extra matrix)
    public static int[][] rotate90Extra(int[][] matrix) {
        // TODO: map (i, j) to (j, n-1-i) into new matrix
        return null;
    }

    // Q41: Rotate matrix 90 degrees clockwise in-place (transpose + reverse rows)
    public static void rotate90InPlace(int[][] matrix) {
        // TODO: transpose then reverse each row
    }

    // Q42: Search in sorted 2D matrix (brute force)
    public static boolean searchMatrixBruteForce(int[][] matrix, int target) {
        // TODO: nested loops to find target
        return false;
    }

    // Q42: Search in sorted 2D matrix (staircase method)
    public static boolean searchMatrixOptimized(int[][] matrix, int target) {
        // TODO: start from top-right and move left/down
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and cols:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}


