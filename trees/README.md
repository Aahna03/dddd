## Trees – Complete Roadmap (Java)

Mirrors `Trees_Roadmap_Beginner_vs_Optimized.csv`.  
Work through each topic sequentially: implement the beginner idea first, then refactor to the optimized DFS/BFS pattern inside the referenced Java file.

---

### Tree Basics

| # | Question                           | Beginner Approach                              | Optimized / Pattern Insight                |
|---|------------------------------------|------------------------------------------------|--------------------------------------------|
| 1 | Create & represent a binary tree   | Manually create nodes and link pointers        | Reusable `TreeNode` class + BFS/DFS helpers|
| 2 | Height / depth of a tree           | Simple recursive depth calculation             | DFS recursion reused across problems       |
| 3 | Count nodes / leaf nodes           | Traverse each node and increment counters      | Single traversal returning counts          |

**Implementation**: `TreeBasics.java`

---

### Tree Traversals

| # | Question                         | Beginner Approach                     | Optimized / Pattern Insight                    |
|---|----------------------------------|---------------------------------------|------------------------------------------------|
| 4 | Inorder / Preorder / Postorder   | Recursive traversal functions         | Iterative stack-based traversals               |
| 5 | Level order traversal (BFS)      | Use queue to process nodes level-wise | Queue-based BFS with level separation (O(n))   |

**Implementation**: `TreeTraversals.java`

---

### Intermediate Trees

| # | Question                     | Beginner Approach                                  | Optimized / Pattern Insight                  |
|---|------------------------------|----------------------------------------------------|----------------------------------------------|
| 6 | Diameter of binary tree      | For every node compute heights separately (O(n²)) | One DFS returning height + diameter (O(n))   |
| 7 | Check if tree is balanced    | Compute height for each subtree repeatedly        | Single DFS checking balance + returning height|
| 8 | Right / Left view of tree    | Multiple loops or maps per level                  | BFS capturing first/last node per level      |

**Implementation**: `IntermediateTreeProblems.java`

---

### Advanced Trees

| # | Question                 | Beginner Approach                          | Optimized / Pattern Insight                           |
|---|--------------------------|--------------------------------------------|-------------------------------------------------------|
| 9 | Lowest Common Ancestor   | Find root-to-node paths then compare       | Single DFS or binary lifting (for general tree)       |
|10 | Boundary Traversal       | Separate loops for left boundary/leaves    | Unified DFS capturing left boundary, leaves, right boundary |

**Implementation**: `AdvancedTreeProblems.java`

---

### Study Tips

1. Reuse a `TreeNode` class and tree builder utility for consistent practice.  
2. Draw recursion trees to understand traversal order and base cases.  
3. For BFS problems, track level size to separate levels or views.  
4. Memorize patterns: “post-order return height/extra info” solves diameter/balanced questions.  
5. For advanced LCA/boundary problems, write helper functions (e.g., `findPath`, `addLeftBoundary`, etc.) to keep logic clean.

