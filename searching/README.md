## Searching – Complete Roadmap (Java)

Mirrors `Searching_Roadmap_Beginner_vs_Optimized.csv`.  
Work through each topic sequentially—start with beginner approach, then code the optimized version in the referenced Java file.

---

### Searching Basics

| #   | Question                          | Beginner Approach                                  | Optimized / Pattern       |
| --- | --------------------------------- | -------------------------------------------------- | ------------------------- |
| 1   | Linear Search                     | Check each element one by one                      | Direct O(n) scan          |
| 2   | Why Searching Needs Sorted Arrays | Try binary search on unsorted input → observe fail | Sort first or use hashing |

**Implementation**: `SearchingBasics.java`

---

### Binary Search Core

| #   | Question                        | Beginner Approach                              | Optimized / Pattern                   |
| --- | ------------------------------- | ---------------------------------------------- | ------------------------------------- |
| 3   | Basic Binary Search (find elem) | Manual loop with `low`, `high`, `mid`, compare | Binary search O(log n)                |
| 4   | Order-Agnostic Binary Search    | Try both ascending & descending cases          | Detect order then apply binary search |

**Implementation**: `BinarySearchCore.java`

---

### Binary Search Variants

| #   | Question                      | Beginner Approach             | Optimized / Pattern                     |
| --- | ----------------------------- | ----------------------------- | --------------------------------------- |
| 5   | First and Last Occurrence     | Linear scan to find positions | Lower/upper bound via binary search     |
| 6   | Find Number of Occurrences    | Loop and count repeats        | Use boundary indices from binary search |
| 7   | Peak Element (Mountain Array) | Brute force scan to find peak | Binary search on unimodal array         |

**Implementation**: `BinarySearchVariants.java`

---

### Binary Search on Answer

| #   | Question                                 | Beginner Approach                      | Optimized / Pattern                           |
| --- | ---------------------------------------- | -------------------------------------- | --------------------------------------------- |
| 8   | Minimum Capacity / Threshold Problems    | Try all capacities to test feasibility | Binary search over answer + feasibility check |
| 9   | Koko Eating Bananas / Painters Partition | Brute-force simulate speeds/partitions | Binary search on answer + monotonic predicate |

**Implementation**: `BinarySearchOnAnswerProblems.java`

---

### Advanced Searching

| #   | Question                       | Beginner Approach            | Optimized / Pattern             |
| --- | ------------------------------ | ---------------------------- | ------------------------------- |
| 10  | Search in Rotated Sorted Array | Linear search or naive split | Binary search + pivot detection |

**Implementation**: `AdvancedSearching.java`

---

### Study Tips

1. Print every intermediate value (`low`, `high`, `mid`) when learning—helps visualize narrowing.
2. For “binary search on answer,” clearly define the search space and a `can(mid)` feasibility function.
3. Practice dry runs on paper for tricky cases (duplicate elements, rotation pivot near ends).
4. Annotate time/space complexity for both beginner and optimized solutions in each file.
