## Sorting – Complete Roadmap (Java)

Mirrors `Sorting_Roadmap_Beginner_vs_Optimized.csv`.  
Tackle topics in order: implement the beginner version first, then upgrade to the optimized/pattern-based approach using the referenced Java files.

---

### Basic Sorting

| # | Question        | Beginner Approach                          | Optimized / Pattern Insight                            |
|---|-----------------|--------------------------------------------|--------------------------------------------------------|
| 1 | Bubble Sort     | Compare adjacent elements and swap         | Understand it’s O(n²) and avoid on large inputs        |
| 2 | Selection Sort  | Find minimum and place at correct index    | Use when swaps must be minimized                       |
| 3 | Insertion Sort  | Shift larger elements right, insert key    | Works best on nearly-sorted arrays                     |

**Implementation**: `BasicSortingAlgorithms.java`

---

### Intermediate Sorting

| # | Question                               | Beginner Approach                              | Optimized / Pattern Insight                       |
|---|----------------------------------------|------------------------------------------------|---------------------------------------------------|
| 4 | Sorting Stability Concept              | Test with duplicate keys to spot instability   | Learn which algorithms preserve order             |
| 5 | Sorting in Descending / Custom Order   | Reverse loops or manually compare characters   | Use comparators / lambdas for custom ordering     |

**Implementation**: `IntermediateSortingConcepts.java`

---

### Divide & Conquer Sorting

| # | Question   | Beginner Approach          | Optimized / Pattern Insight                 |
|---|------------|----------------------------|---------------------------------------------|
| 6 | Merge Sort | Recursively split & merge  | Stable O(n log n) general-purpose sort      |
| 7 | Quick Sort | Partition around pivot     | Randomized pivot keeps average O(n log n)   |

**Implementation**: `DivideAndConquerSorting.java`

---

### Optimized Patterns

| # | Question              | Beginner Approach                         | Optimized / Pattern Insight                        |
|---|-----------------------|-------------------------------------------|----------------------------------------------------|
| 8 | Counting Sort         | Count occurrences and rebuild             | O(n) when input range is small                     |
| 9 | Bucket / Radix Sort   | Distribute to buckets, sort individually  | Great for floats or very large integer ranges      |

**Implementation**: `LinearTimeSorting.java`

---

### Advanced Sorting

| # | Question                          | Beginner Approach                        | Optimized / Pattern Insight                |
|---|-----------------------------------|------------------------------------------|--------------------------------------------|
|10 | Sort Colors / Dutch National Flag | Multiple passes for each color           | Three-pointer partition in single pass     |

**Implementation**: `AdvancedSortingProblems.java`

---

### How to Practice

1. Start with the brute-force or naive version to build intuition.  
2. Refactor into the optimized approach—focus on invariants (pointers, partitions, recursion).  
3. Print intermediary states (array after each pass) while learning.  
4. Note stability, time, and space complexity in comments for each implementation.  
5. Compare your custom sorts with `Arrays.sort()` output to validate correctness.

