## Backtracking – Complete Roadmap (Java)

Mirrors `Backtracking_Roadmap_Beginner_vs_Optimized.csv`.  
Follow the same pattern as other tracks: implement the beginner brute-force idea first, then refactor into the optimized/backtracking template inside the referenced Java file.

---

### Backtracking Basics

| # | Question                 | Beginner Approach                                     | Optimized / Pattern Insight                       |
|---|--------------------------|-------------------------------------------------------|---------------------------------------------------|
| 1 | Subset Generation        | Choose / not choose each element via brute force      | Standard include/exclude template with pruning    |
| 2 | Permutation Generation   | Swap-based permutations                               | Used-array + depth tracking for clarity           |
| 3 | Combination Sum I        | Try all combinations without pruning                  | Sort + stop when sum exceeds target (prune)       |

**Implementation**: `BacktrackingBasics.java`

---

### Intermediate Backtracking

| # | Question                          | Beginner Approach                                   | Optimized / Pattern Insight                               |
|---|-----------------------------------|-----------------------------------------------------|-----------------------------------------------------------|
| 4 | Combination Sum II                | Try all combinations → duplicates repeat            | Sort input + skip duplicates + prune on exceeding sum     |
| 5 | Letter Combinations of Phone #    | Try every letter for each digit                     | DFS/backtracking with digit→letters mapping               |
| 6 | Sudoku Solver                     | Fill cells sequentially without validity checking   | Backtracking + constant-time validity check + early prune |

**Implementation**: `IntermediateBacktracking.java`

---

### Advanced Backtracking

| # | Question                     | Beginner Approach                                     | Optimized / Pattern Insight                                 |
|---|------------------------------|-------------------------------------------------------|-------------------------------------------------------------|
| 7 | N-Queens Problem             | Place queens row by row without fast safety checks    | Track columns & diagonals for O(1) safety checks            |
| 8 | Rat in a Maze (optimized)    | Move all 4 directions without visited tracking        | Use visited matrix + direction order to prune               |
| 9 | Word Search                  | DFS brute force across board with no early exit       | Backtracking with visited state + early stopping            |
|10 | Palindrome Partitioning      | Try partitions blindly                                | Backtracking + memoized palindrome checks                   |

**Implementation**: `AdvancedBacktracking.java`

---

### Study Tips

1. Define **choices, constraints, goal** (CCG) before writing recursion.  
2. Always add/undo steps symmetrically when backtracking.  
3. Sort arrays when pruning helps (Combination Sum problems).  
4. Use boolean arrays/bitsets for quick state checks (columns/diagonals in N-Queens, visited in word search).  
5. Log recursion depth during learning to visualize the search tree; remove logs once confident.

