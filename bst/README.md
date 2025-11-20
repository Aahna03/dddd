## Binary Search Trees – Complete Roadmap (Java)

Mirrors `BST_Roadmap_Beginner_vs_Optimized.csv`.  
Implement each problem twice inside the referenced Java file: start with the beginner idea, then refactor into the optimized BST pattern leveraging the BST property.

---

### BST Basics

| # | Question                     | Beginner Approach                                  | Optimized / Pattern Insight                |
|---|------------------------------|----------------------------------------------------|--------------------------------------------|
| 1 | Create a Binary Search Tree  | Manually create nodes and follow BST ordering      | Recursive insert respecting BST property   |
| 2 | Search in a BST              | Linear scan of entire tree                         | Use BST property to prune search path      |
| 3 | Insert a Node in BST         | Traverse entire tree before placing new node       | Recursive / iterative insert in O(h) time  |

**Implementation**: `BSTBasics.java`

---

### BST Operations

| # | Question                 | Beginner Approach                                    | Optimized / Pattern Insight                             |
|---|--------------------------|------------------------------------------------------|---------------------------------------------------------|
| 4 | Delete a Node from BST   | Rebuild tree without target node                     | Handle 0/1/2-child cases reusing BST rules              |
| 5 | Validate a BST           | Inorder traversal → check sorted result              | DFS with min/max bounds (or inorder without array)      |

**Implementation**: `BSTOperations.java`

---

### Intermediate BST Problems

| # | Question                           | Beginner Approach                              | Optimized / Pattern Insight                    |
|---|------------------------------------|------------------------------------------------|------------------------------------------------|
| 6 | Kth Smallest / Largest Element     | Store inorder traversal in array and index     | Inorder traversal with counter, stop early     |
| 7 | Find floor & ceil in BST           | Brute-force traversal comparing all nodes      | Use BST traversal with pruning                 |

**Implementation**: `IntermediateBSTProblems.java`

---

### Advanced BST Problems

| # | Question                             | Beginner Approach                                  | Optimized / Pattern Insight                               |
|---|--------------------------------------|----------------------------------------------------|-----------------------------------------------------------|
| 8 | Lowest Common Ancestor in BST        | Find root-to-node paths for both nodes             | Use BST property to move left/right (O(h))                |
| 9 | Recover BST (two swapped nodes)      | Sort inorder list and rebuild tree                 | Single inorder traversal detecting swapped nodes          |
|10 | Convert BST to Balanced BST          | Collect nodes inorder and rebuild manually         | Build balanced BST from sorted inorder list               |

**Implementation**: `AdvancedBSTProblems.java`

---

### Study Tips

1. Reuse the `TreeNode` class from the trees module for consistency.  
2. Practice visualizing BST inserts/deletes to remember the three delete cases (leaf, one child, two children).  
3. For kth-element and floor/ceil, track results during inorder traversal to avoid extra storage.  
4. Many BST problems rely on inorder ordering—write helper methods to reuse across files.  
5. Test with skewed trees to understand time complexity dependence on tree height `h`.

