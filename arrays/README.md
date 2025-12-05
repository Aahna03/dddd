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


**Implementation suggestions**

`ArrayBasics.java` → Q1–Q4

`PalindromeArray.java` → Q5

### 2. Searching

| #   | Question                  | Beginner Approach | Optimized / Pattern      |
| --- | ------------------------- | ----------------- | ------------------------ |
| 6   | Linear Search (unsorted)  | Brute Force       | -                        |
| 7   | Binary Search (sorted)    | Binary Search     | -                        |
| 8   | First and Last Occurrence | Linear            | Binary Search Variation  |


**Implementation suggestions**

`LinearBinarySearch.java` → Q6–Q8

### 3. Reversal

| #   | Question           | Beginner Approach | Optimized / Pattern   |
| --- | ------------------ | ----------------- | ---------------------- |
| 9   | Reverse an Array   | Brute Force       | Two Pointers Swap      |
| 10  | Reverse a Subarray | -                 | Two Pointers Variation |

**Implementation suggestions**

`ReverseArray.java` → Q9–Q10

### 4. Rotation & Shifting

| #   | Question                                | Beginner Approach | Optimized / Pattern |
| --- | --------------------------------------- | ----------------- | ------------------- |
| 11  | Rotate Array by One Step                | Shift Loop        | Reversal Method     |
| 12  | Rotate Array by k Steps                 | Shift k Times     | Modulo + Reversal   |
| 13  | Cyclic Rotation (last element to front) | Brute Force       | -                   |

**Implementation suggestions**

`RotateArray.java` → Q11–Q13

### 5. Sorting & Order

| #   | Question            | Beginner Approach | Optimized / Pattern        |
| --- | ------------------- | ----------------- | -------------------------- |
| 14  | Bubble Sort         | Brute Force       | Slightly Optimized Loop    |
| 15  | Selection Sort      | Brute Force       | -                          |
| 16  | Insertion Sort      | Brute Force       | -                          |
| 17  | Find Second Largest | Brute Force       | Single Pass / Min-Heap     |

**Implementation suggestions**

`BasicSorting.java`→ Q14–Q16

SecondLargest.java → Q17

### 6. Duplicate Handling

| #   | Question                       | Beginner Approach       | Optimized / Pattern              |
| --- | ------------------------------ | ------------------------| ---------------------------------|
| 18  | Remove Duplicates              | Nested loops / visited  | HashSet / Two Pointers (sorted)  |
| 19  | Find All Duplicate Elements    | Nested loops / visited  | HashMap                          |
| 20  | Find Frequency of Each Element | Nested loops / visited  | HashMap                          |


**Implementation suggestions**

`DuplicateHandling.java` → Q18–Q20

### 7. Subarray (Continuous)

| #   | Question                | Beginner Approach | Optimized / Pattern  |
| --- | ----------------------- | ----------------- | -------------------- |
| 21  | Print All Subarrays     | O(n²) Brute Force | -                    |
| 22  | Maximum Subarray Sum    | Brute Force       | Kadane’s Algorithm   |
| 23  | Subarray with Given Sum | Brute Force       | Prefix Sum / HashMap |


**Implementation suggestions**

`SubarraysBasics.java` → Q21, Q23

`MaximumSubarray.java` → Q22

### 8. Two Pointers

| #   | Question                        | Beginner Approach | Optimized / Pattern      |
| --- | ------------------------------- | ----------------- | ------------------------ |
| 24  | Palindrome Check (Optimized Q5) | -                 | Two Pointers             |
| 25  | Reverse Array (Optimized Q9)    | -                 | Two Pointers             |
| 26  | Pair with Given Sum (2-sum)     | Brute Force       | Two Pointers / HashMap   |
| 27  | Triplet with Given Sum (3-sum)  | Brute Force       | Sorting + Two Pointers   |
| 28  | Move Zeroes to End              | Brute Force       | Two Pointers             |
| 29  | Segregate Positive & Negative   | Brute Force       | Two Pointers Partition   |



**Implementation suggestions**

`TwoSum.java` → Q26

`ThreeSumAndRearrange.java` → Q27-29

### 9. Prefix Sum and Hashing

| #   | Question                              | Beginner Approach | Optimized / Pattern     |
| --- | ------------------------------------- | ----------------- | ------------------------ |
| 30  | Subarray Sum = K                      | Brute Force       | Prefix Sum / HashMap    |
| 31  | Longest Subarray with Equal 0s and 1s | -                 | Prefix Sum + HashMap    |
| 32  | Subarray with 0 Sum                   | -                 | Prefix Sum + HashMap    |


**Implementation suggestions**

`PrefixSumHashing.java` → Q30–Q32

### 10. Sliding window

| #   | Question                                  | Beginner Approach | Optimized / Pattern           |
| --- | ----------------------------------------- | ----------------- | ----------------------------- |
| 33  | Maximum Sum Subarray of Size k            | Brute Force       | Sliding Window                |
| 34  | Smallest Subarray with Sum ≥ K            | Brute Force       | Sliding Window / Two Pointers |
| 35  | Longest Subarray with K Distinct Elements | -                 | Sliding Window + HashMap      |


**Implementation suggestions**

`SlidingWindowProblems.java` → Q33-35

### 11. Binary Search on answer

| #   | Question                                | Beginner Approach | Optimized / Pattern      |
| --- | --------------------------------------- | ----------------- | ------------------------ |
| 36  | Minimum Element in Rotated Sorted Array | -                 | Binary Search on Answer |
| 37  | Search in Rotated Sorted Array          | -                 | Binary Search on Answer |
| 38  | Median of Two Sorted Arrays             | -                 | Binary Search on Answer |
| 39  | Allocate Minimum Pages                  | -                 | Binary Search on Answer |


**Implementation suggestions**

`BinarySearchOnAnswer.java` → Q36-39

| #   | Question                     | Beginner Approach | Optimized / Pattern               |
| --- | ---------------------------- | ----------------- | --------------------------------- |
| 40  | Spiral Traversal             | Brute Force       | -                                 |
| 41  | Rotate Matrix by 90°         | Brute Force       | Transpose + Reverse Rows          |
| 42  | Search in a Sorted 2D Matrix | Brute Force       | Staircase Method                  |


### 12. Matrix Problems

**Implementation suggestions**

`MatrixProblems.java` → Q40-42

### How to Study

- **Step 1**: Pick a topic section (e.g., _Traversal & Basics_).
- **Step 2**: Implement the **beginner approach** first (brute force / straightforward).
- **Step 3**: Refactor or write a new method for the **optimized approach / pattern**.
- **Step 4**: Practice explaining the time & space complexity of both versions in words.
