## Queues – Complete Roadmap (Java)

Mirrors `Queues_Roadmap_Beginner_vs_Optimized.csv`.  
Implement each problem twice in the referenced Java file: first the basic / brute-force approach, then refactor into the optimized queue pattern.

---

### Queue Basics

| # | Question                         | Beginner Approach                                   | Optimized / Pattern Insight                   |
|---|----------------------------------|-----------------------------------------------------|-----------------------------------------------|
| 1 | Implement Queue using Array      | Shift elements on dequeue (O(n))                    | Use circular indices for O(1) enqueue/dequeue |
| 2 | Implement Queue using Linked List| Use nodes for enqueue/dequeue                       | Maintain `front` / `rear` pointers (O(1))     |
| 3 | Implement Circular Queue         | Manual wrap-around logic                            | Modulo arithmetic cleanly handles wrap        |

**Implementation**: `QueueBasics.java`

---

### Intermediate Queues

| # | Question                         | Beginner Approach                                 | Optimized / Pattern Insight                        |
|---|----------------------------------|---------------------------------------------------|----------------------------------------------------|
| 4 | Queue using Two Stacks           | Move all elements between stacks each operation   | Amortized O(1) with lazy transfer                  |
| 5 | Stack using Two Queues           | Expensive enqueue/dequeue for every push/pop      | Use push-pop balancing to keep amortized O(1) ops  |
| 6 | Generate Binary Numbers using Queue | Generate via brute-force strings                | Breadth-first queue to produce binary sequence     |

**Implementation**: `IntermediateQueueProblems.java`

---

### Advanced Queue Patterns

| # | Question                                | Beginner Approach                              | Optimized / Pattern Insight                         |
|---|-----------------------------------------|------------------------------------------------|-----------------------------------------------------|
| 7 | Sliding Window Maximum                  | Nested loops to find max each window           | Monotonic deque (double-ended queue)                |
| 8 | Rotten Oranges (BFS)                    | Manual simulation                              | Multi-source BFS using queue                        |
| 9 | First Non-Repeating Character in Stream | Re-scan entire stream for each character       | Queue + frequency map to track order & counts       |
|10 | LRU Cache Concept                       | Store states and search linearly               | LinkedHashMap / custom doubly-linked list + HashMap |

**Implementation**: `AdvancedQueuePatterns.java`

---

### Practice Tips

1. Reuse a small reusable `Node` class for linked-list queues.  
2. For circular queues, carefully distinguish between full vs empty states.  
3. Understand amortized analysis for “queue via stacks” and “stack via queues”.  
4. Monotonic deque patterns reappear in sliding window, stock span, etc.—practice thoroughly.  
5. LRU cache requires mastering doubly linked lists + hash maps working together.

