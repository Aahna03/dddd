## Heaps – Complete Roadmap (Java)

Mirrors `Heaps_Roadmap_Beginner_vs_Optimized.csv`.  
Implement each item twice in the referenced Java file: start with the naive approach to understand the mechanics, then refactor into the optimized heap pattern (min/max heap).

---

### Heap Basics

| # | Question                         | Beginner Approach                               | Optimized / Pattern Insight                         |
|---|----------------------------------|-------------------------------------------------|-----------------------------------------------------|
| 1 | What is a Heap (Min/Max heap)    | Understand binary tree structure & properties   | Root is min/max; children maintain heap property    |
| 2 | Heap Representation (array based)| Store as array but visualize as tree            | Use `left=2i+1`, `right=2i+2` formulas              |
| 3 | Build Heap                       | Insert nodes one-by-one (O(n log n))            | Heapify from bottom to top in O(n)                  |

**Implementation**: `HeapBasics.java`

---

### Heap Operations

| # | Question                    | Beginner Approach                               | Optimized / Pattern Insight                |
|---|-----------------------------|-------------------------------------------------|--------------------------------------------|
| 4 | Insert into Heap            | Append and manually bubble-up                   | Bubble-up swapping until heap property holds|
| 5 | Delete / Extract Min or Max | Remove root and rebuild entire heap             | Swap root with last, remove last, heapify-down |

**Implementation**: `HeapOperations.java`

---

### Intermediate Heap Problems

| # | Question                            | Beginner Approach                      | Optimized / Pattern Insight                      |
|---|-------------------------------------|----------------------------------------|--------------------------------------------------|
| 6 | K Largest / K Smallest Elements     | Sort array then take first/last K      | Use min/max heap of size K → O(n log k)          |
| 7 | Heap Sort                           | Use built-in sort                      | Heapify + repeated extraction (in-place heapsort) |

**Implementation**: `IntermediateHeapProblems.java`

---

### Advanced Heap Problems

| # | Question                       | Beginner Approach                                  | Optimized / Pattern Insight                        |
|---|--------------------------------|----------------------------------------------------|----------------------------------------------------|
| 8 | Merge K Sorted Lists           | Merge using nested loops / repeated linear scans   | Min-heap (priority queue) for k-way merge          |
| 9 | Top K Frequent Elements        | Count frequency then sort entire list              | HashMap + min/max heap based on frequency          |
|10 | Find Median from Data Stream   | Store entire stream and sort per query             | Two-heaps approach (max-heap lower half, min-heap upper half) |

**Implementation**: `AdvancedHeapProblems.java`

---

### Study Tips

1. Practice writing `heapifyUp` and `heapifyDown` helpers; most heap problems reuse them.  
2. Understand the difference between min-heap vs max-heap and when to invert values.  
3. For k-largest/smallest, remember the trick: maintain a heap of size `k` while scanning.  
4. For merge/top-frequency/median problems, combine heaps with hash maps or custom objects.  
5. Test with small arrays and print the heap array after each operation to verify correctness.

