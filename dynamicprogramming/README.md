Mirrors DP_Roadmap_Beginner_vs_Optimized.csv.
Always start with the plain recursion, observe repeated work, then refactor into memoization and finally tabulation.
This is the most reliable way to master DP.

`DP Basics`

# Question / Concept Beginner Approach Optimized / Pattern Insight

1 What is DP (Memoization vs Tabulation) Write pure recursive function Convert recursion → memo → tabulation
2 Overlapping Subproblems & Optimal Substructure Observe repeated subtree computations Identify patterns where DP reduces work
3 Climbing Stairs f(n)=f(n-1)+f(n-2) naive recursion 1D DP array or space-optimized DP

**Implementation**: `DPBasics.java`

1D Dynamic Programming

# Question / Concept Beginner Approach Optimized / Pattern Insight

4 House Robber Recursive pick/not pick DP with rolling array (O(1) space)
5 Frog Jump (Min Energy) DFS through all possible jumps DP storing min energy from each index

**Implementation**: `DP1D.java`

2D Dynamic Programming

# Question / Concept Beginner Approach Optimized / Pattern Insight

6 Longest Common Subsequence (LCS) Recursive match/mismatch rules 2D DP table of size n×m
7 Edit Distance Try all insert/remove/replace operations recursively 2D DP with three-state transitions

**Implementation**: `DP2D.java`

DP on Subsequences

# Question / Concept Beginner Approach Optimized / Pattern Insight

8 Knapsack (0/1) Recursive pick/not-pick combinations DP table using weight/value state (O(N×W))
9 Longest Increasing Subsequence (LIS) Brute check all subsequences DP O(n²) or Patience Sorting + Binary Search (O(n log n))

**Implementation**: `DPSubsequence.java`

Advanced DP

# Question / Concept Beginner Approach Optimized / Pattern Insight

10 Matrix Chain Multiplication (MCM) Try every partition recursively DP with cost matrix; later add Knuth/Optimizations

**Implementation**: `DPAdvanced.java`

Study Tips

1. Always write recursion first

Every DP solution is just an optimized recursion.
If the recursion isn’t clear, the DP transition never will be.

2. Move from Recursion → Memoization → Tabulation

This is the golden sequence:

1. Write recursion
2. Add dp[] or dp[][] memo array
3. Convert memo to table

4. Patterns to master

1D DP → simple linear transitions

2D DP → grid or matrix state

DP on subsequences → pick / not pick

DP on strings → match / mismatch rules

DP on partitions → try splitting at every k

4. Draw recursion trees

This helps identify:

overlapping subproblems

optimal substructure

repeated work patterns

5. Know when to optimize further

Certain DP problems benefit from:

Space optimization

Binary search optimizations

Prefix/suffix optimizations

Knuth Optimization / Divide & Conquer DP (for advanced problems)
