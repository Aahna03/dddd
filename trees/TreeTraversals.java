import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Topic: Tree Traversals
 *
 * Q4. Inorder / Preorder / Postorder traversals
 *    - Beginner: recursive functions.
 *    - Optimized: iterative stack-based versions.
 *
 * Q5. Level order traversal (BFS)
 *    - Queue-based BFS to process levels.
 */
public class TreeTraversals {

    // Recursive traversals
    public static void inorderRecursive(TreeNode root, List<Integer> result) {
        // TODO: standard inorder recursion
    }

    public static void preorderRecursive(TreeNode root, List<Integer> result) {
        // TODO
    }

    public static void postorderRecursive(TreeNode root, List<Integer> result) {
        // TODO
    }

    // Iterative traversals using stack
    public static List<Integer> inorderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        // TODO: simulate inorder using stack
        return result;
    }

    public static List<Integer> preorderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // TODO: use stack pushing right child first
        return result;
    }

    public static List<Integer> postorderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // TODO: use two stacks or one stack with visited flag
        return result;
    }

    // Level order traversal
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;
        Queue<TreeNode> queue = new LinkedList<>();
        // TODO: BFS with queue.size() to separate levels
        return levels;
    }
}


