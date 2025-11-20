## Arrays – Complete Roadmap (Java)

This folder follows your `Array_Roadmap_Beginner_vs_Optimized.csv`.  
Each topic has problems with a **beginner approach** and an **optimized / pattern-based approach**.

Use this as a checklist: go **row by row** and implement the beginner approach first, then the optimized one.

---

### 1. Traversal & Basics

| #   | Question                              | Beginner Approach | Optimized / Pattern |
| --- | ------------------------------------- | ----------------- | ------------------- |
| 1   | Input and Print an Array              | Brute Force       | -                   |
| 2   | Find Maximum and Minimum Element      | Brute Force       | -                   |
| 3   | Calculate Sum and Average of Elements | Brute Force       | -                   |
| 4   | Count Occurrences of an Element       | Brute Force       | -                   |
| 5   | Check if Array is Palindrome          | Reverse & Compare | Two Pointers        |

**Implementation suggestions**:

- Create `ArrayBasics.java` for Q1–Q4.
- Create `PalindromeArray.java` for Q5 (include both reverse & compare and two-pointers methods).

---

### 2. Searching

| #   | Question                  | Beginner Approach | Optimized / Pattern     |
| --- | ------------------------- | ----------------- | ----------------------- |
| 6   | Linear Search (unsorted)  | Brute Force       | -                       |
| 7   | Binary Search (sorted)    | Binary Search     | -                       |
| 8   | First and Last Occurrence | Linear            | Binary Search variation |

**Implementation suggestions**:

- Create `LinearBinarySearch.java` for Q6–Q8.

---

### 3. Reversal

| #   | Question           | Beginner Approach | Optimized / Pattern    |
| --- | ------------------ | ----------------- | ---------------------- |
| 9   | Reverse an Array   | Brute Force       | Two Pointers Swap      |
| 10  | Reverse a Subarray | -                 | Two Pointers Variation |

**Implementation suggestions**:

- Create `ReverseArray.java` for Q9–Q10 (two-pointer based methods).

---

### 4. Rotation & Shifting

| #   | Question                                | Beginner Approach | Optimized / Pattern |
| --- | --------------------------------------- | ----------------- | ------------------- |
| 11  | Rotate Array by One Step                | Shift Loop        | Reversal Method     |
| 12  | Rotate Array by k Steps                 | Shift k Times     | Modulo + Reversal   |
| 13  | Cyclic Rotation (last element to front) | Brute Force       | -                   |

**Implementation suggestions**:

- Use `RotateArray.java` for Q11–Q13. Implement both extra-array and in-place reversal methods.

---

### 5. Sorting & Order

| #   | Question            | Beginner Approach | Optimized / Pattern       |
| --- | ------------------- | ----------------- | ------------------------- |
| 14  | Bubble Sort         | Brute Force       | (slightly optimized loop) |
| 15  | Selection Sort      | Brute Force       | -                         |
| 16  | Insertion Sort      | Brute Force       | -                         |
| 17  | Find Second Largest | Brute Force       | Single Pass / Heap        |

**Implementation suggestions**:

- Create `BasicSorting.java` for Q14–Q16.
- Create `SecondLargest.java` for Q17.

---

### 6. Duplicate Handling

| #   | Question                       | Beginner Approach | Optimized / Pattern                |
| --- | ------------------------------ | ----------------- | ---------------------------------- |
| 18  | Remove Duplicates              | Brute Force       | HashSet / Two Pointers (if sorted) |
| 19  | Find All Duplicate Elements    | Brute Force       | HashMap / Frequency Count          |
| 20  | Find Frequency of Each Element | Brute Force       | HashMap                            |

**Implementation suggestions**:

- Create `DuplicateHandling.java` with different methods for Q18–Q20.

---

### 7. Subarray & Subsequence

| #   | Question                | Beginner Approach | Optimized / Pattern  |
| --- | ----------------------- | ----------------- | -------------------- |
| 21  | Print All Subarrays     | O(n²) Brute Force | -                    |
| 22  | Maximum Subarray Sum    | Brute Force       | Kadane’s Algorithm   |
| 23  | Subarray with Given Sum | Brute Force       | Prefix Sum / HashMap |

**Implementation suggestions**:

- Use `MaximumSubarray.java` for Q22.
- Create `SubarraysBasics.java` for Q21 and Q23.

---

### 8. Two Pointers Technique

| #   | Question                        | Beginner Approach | Optimized / Pattern    |
| --- | ------------------------------- | ----------------- | ---------------------- |
| 24  | Palindrome Check (Q5 Optimized) | -                 | Two Pointers           |
| 25  | Reverse Array (Q9 Optimized)    | -                 | Two Pointers           |
| 26  | Pair with Given Sum (2-sum)     | Brute Force       | Two Pointers / HashMap |
| 27  | Triplet with Given Sum (3-sum)  | Brute Force       | Sorting + Two Pointers |
| 28  | Move Zeroes to End              | Brute Force       | Two Pointers           |
| 29  | Segregate Positive & Negative   | Brute Force       | Two Pointers Partition |

**Implementation suggestions**:

- `TwoSum.java` for Q26 (2-sum).
- Create `ThreeSumAndRearrange.java` for Q27–Q29.
- Reuse `PalindromeArray.java` and `ReverseArray.java` for Q24–Q25.

---

### 9. Prefix Sum & Hashing

| #   | Question                              | Beginner Approach | Optimized / Pattern  |
| --- | ------------------------------------- | ----------------- | -------------------- |
| 30  | Subarray Sum = K                      | Brute Force       | Prefix Sum / HashMap |
| 31  | Longest Subarray with Equal 0s and 1s | -                 | Prefix Sum + HashMap |
| 32  | Subarray with 0 Sum                   | -                 | Prefix Sum + HashMap |

**Implementation suggestions**:

- Create `PrefixSumHashing.java` with methods for Q30–Q32.

---

### 10. Sliding Window

| #   | Question                                  | Beginner Approach | Optimized / Pattern           |
| --- | ----------------------------------------- | ----------------- | ----------------------------- |
| 33  | Maximum Sum Subarray of Size k            | Brute Force       | Sliding Window                |
| 34  | Smallest Subarray with Sum ≥ K            | Brute Force       | Sliding Window / Two Pointers |
| 35  | Longest Subarray with K Distinct Elements | -                 | Sliding Window + HashMap      |

**Implementation suggestions**:

- Create `SlidingWindowProblems.java` for Q33–Q35.

---

### 11. Binary Search on Answer

| #   | Question                                | Beginner Approach | Optimized / Pattern     |
| --- | --------------------------------------- | ----------------- | ----------------------- |
| 36  | Minimum Element in Rotated Sorted Array | -                 | Binary Search on Answer |
| 37  | Search in Rotated Sorted Array          | -                 | Binary Search on Answer |
| 38  | Median of Two Sorted Arrays             | -                 | Binary Search on Answer |
| 39  | Allocate Minimum Pages                  | -                 | Binary Search on Answer |

**Implementation suggestions**:

- Create `BinarySearchOnAnswer.java` with separate methods for Q36–Q39.

---

### 12. Matrix as 2D Arrays

| #   | Question                     | Beginner Approach | Optimized / Pattern                 |
| --- | ---------------------------- | ----------------- | ----------------------------------- |
| 40  | Spiral Traversal             | Brute Force       | -                                   |
| 41  | Rotate Matrix by 90°         | Brute Force       | Transpose + Reverse Rows            |
| 42  | Search in a Sorted 2D Matrix | Brute Force       | Optimized Search (staircase method) |

**Implementation suggestions**:

- Create `MatrixProblems.java` with methods for Q40–Q42.

---

### How to Study

- **Step 1**: Pick a topic section (e.g., _Traversal & Basics_).
- **Step 2**: Implement the **beginner approach** first (brute force / straightforward).
- **Step 3**: Refactor or write a new method for the **optimized approach / pattern**.
- **Step 4**: Practice explaining the time & space complexity of both versions in words.
