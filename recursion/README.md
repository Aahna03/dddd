## Recursion – Complete Roadmap (Java)

Mirrors `Recursion_Roadmap_Beginner_vs_Optimized.csv`.  
Each section lists the question, beginner intuition, and the optimized / pattern approach. Implement the referenced Java file with both versions.

---

### Recursion Basics

| # | Question                               | Beginner Approach                               | Optimized / Pattern Insight                 |
|---|----------------------------------------|-------------------------------------------------|---------------------------------------------|
| 1 | Print numbers 1 to N (simple recursion) | Direct recursive calls in increasing/decreasing | Note tail recursion optimization            |
| 2 | Factorial / Fibonacci                   | Draw recursion tree to understand flow          | Memoization for Fibonacci                   |
| 3 | Power (x^n)                             | Multiply x, n times (naive recursion)           | Binary exponentiation (fast power)          |

**Implementation**: `RecursionBasics.java`

---

### Intermediate Recursion

| # | Question                                 | Beginner Approach                               | Optimized / Pattern Insight        |
|---|------------------------------------------|-------------------------------------------------|------------------------------------|
| 4 | Sum of digits / Reverse number           | Process digits recursively (mod/div)            | Efficient digit extraction         |
| 5 | Tower of Hanoi                           | Follow 3-step disk movement rule manually       | Understand minimal moves (2^n - 1) |

**Implementation**: `IntermediateRecursion.java`

---

### Backtracking

| # | Question                | Beginner Approach                        | Optimized / Pattern Insight          |
|---|-------------------------|------------------------------------------|--------------------------------------|
| 6 | Generate all subsets    | Brute-force include/exclude recursion    | Backtracking with pruning / order    |
| 7 | Generate all permutations| Swap characters recursively              | Backtracking with boolean used array |
| 8 | Rat in a Maze           | Try all directions without pruning       | Backtracking + visited matrix        |

**Implementation**: `BacktrackingProblems.java`

---

### Advanced Recursion

| # | Question                 | Beginner Approach                     | Optimized / Pattern Insight               |
|---|--------------------------|---------------------------------------|-------------------------------------------|
| 9 | N-Queens Problem         | Place queens row by row without checks| Backtracking + safety checks/pruning      |
|10 | Palindrome partitioning  | Try all partitions recursively        | Backtracking + DP for palindrome checking |

**Implementation**: `AdvancedRecursionProblems.java`

---

### Practice Tips

1. Always state the **base case** and ensure it’s reached to avoid stack overflow.  
2. Dry-run small inputs and draw recursion trees to understand call order.  
3. For backtracking, track your **choices, constraints, and goal** (C-C-G).  
4. Memoize overlapping subproblems (e.g., Fibonacci, palindrome checks).  
5. Print entry/exit logs initially to visualize the call stack; remove once confident.

