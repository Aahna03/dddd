## Stacks – Complete Roadmap (Java)

Mirrors `Stacks_Roadmap_Beginner_vs_Optimized.csv`.  
Each topic lists the questions, brute-force intuition, and the optimized pattern. Implement both approaches in the referenced Java file.

---

### Stack Basics

| # | Question                        | Beginner Approach                              | Optimized / Pattern Insight             |
|---|---------------------------------|-----------------------------------------------|-----------------------------------------|
| 1 | Implement Stack using Array     | Use array/list with push/pop operations        | O(1) amortized, handle overflow/underflow|
| 2 | Implement Stack using LinkedList| Maintain top pointer in singly linked list     | All ops O(1) with head pointer          |
| 3 | Valid Parentheses               | Push opening brackets, match closing manually  | Stack + bracket map + early validation  |

**Implementation**: `StackBasics.java`

---

### Intermediate Stack Problems

| # | Question                       | Beginner Approach                     | Optimized / Pattern Insight            |
|---|--------------------------------|---------------------------------------|----------------------------------------|
| 4 | Next Greater Element           | Nested loops to find next larger item | Monotonic decreasing stack             |
| 5 | Min Stack                      | Track minimum in extra array          | Auxiliary stack / pair to track min    |
| 6 | Balanced Expression Evaluation | Manual evaluation without clear stack | Stack-based operator precedence        |

**Implementation**: `IntermediateStackProblems.java`

---

### Advanced Stack Patterns

| # | Question                         | Beginner Approach                               | Optimized / Pattern Insight                    |
|---|----------------------------------|-------------------------------------------------|-----------------------------------------------|
| 7 | Reverse a Stack using Recursion  | Use extra stack to hold elements                | Recursive helper leveraging call stack        |
| 8 | Sort a Stack using Recursion     | Use auxiliary stack to insert sorted            | Recursion + insert in sorted position         |
| 9 | Asteroid Collision               | Simulate collisions with multiple passes       | Monotonic stack O(n) handling collisions      |
|10 | Daily Temperatures               | Brute-force compare each day with future days  | Monotonic decreasing stack for O(n) solution  |

**Implementation**: `AdvancedStackPatterns.java`

---

### Practice Tips

1. Always analyze when a **monotonic stack** helps (next greater/smaller).  
2. For custom stacks (MinStack), track auxiliary info with each push.  
3. Recursion-based stack operations leverage the call stack—add comments about unwinding.  
4. Validate push/pop underflow conditions to avoid runtime errors.  
5. Compare outputs against `java.util.Stack` in early practice runs to confirm correctness.

