## Strings – Complete Roadmap (Java)

This folder mirrors `String_Roadmap__Beginner_vs_Optimized_.csv`.  
Each topic lists the problem, a beginner approach, and the optimized / pattern-based approach to implement in the matching Java file.

---

### 1. Basics

| #   | Question                                                 | Beginner Approach                                 | Optimized / Pattern            |
| --- | -------------------------------------------------------- | ------------------------------------------------- | ------------------------------ |
| 1   | Count vowels, consonants, digits, and spaces in a string | Iterate through characters and increment counters | Regex / built-in utilities     |
| 2   | Convert string to uppercase / lowercase / toggle case    | Manual ASCII conversion loop                      | Built-in `.toUpperCase()` etc. |
| 3   | Find length of string without built-in functions         | Traverse until end index / sentinel               | Use `length()` directly        |

**Implementation**: `StringBasics.java`

---

### 2. Traversal & Character Operations

| #   | Question                                               | Beginner Approach                      | Optimized / Pattern      |
| --- | ------------------------------------------------------ | -------------------------------------- | ------------------------ |
| 4   | Print all characters with their ASCII values           | Loop and print `char` with cast to int | Streams / helper methods |
| 5   | Remove whitespaces or special characters from a string | Loop/filter manually                   | Regex or chained replace |

**Implementation**: `StringTraversal.java`

---

### 3. Palindrome & Reversal

| #   | Question                      | Beginner Approach         | Optimized / Pattern  |
| --- | ----------------------------- | ------------------------- | -------------------- |
| 6   | Check if string is palindrome | Reverse & compare         | Two pointers         |
| 7   | Reverse words in a sentence   | Split into words, reverse | Two pointers / stack |

**Implementation**: `StringPalindromeAndReversal.java`

---

### 4. Frequency & Anagram Problems

| #   | Question                           | Beginner Approach              | Optimized / Pattern         |
| --- | ---------------------------------- | ------------------------------ | --------------------------- |
| 8   | Check if two strings are anagrams  | Sort and compare               | HashMap / frequency array   |
| 9   | Find first non-repeating character | Frequency map then second scan | LinkedHashMap / single pass |

**Implementation**: `StringFrequencyAnagram.java`

---

### 5. Substrings & Subsequence

| #   | Question                            | Beginner Approach                       | Optimized / Pattern                      |
| --- | ----------------------------------- | --------------------------------------- | ---------------------------------------- |
| 10  | Find all substrings of a string     | Nested loops to extract every substring | Sliding window / DP based on constraints |
| 11  | Longest common prefix among strings | Compare character by character          | Trie / divide and conquer                |

**Implementation**: `SubstringProblems.java`

---

### 6. Pattern Searching

| #   | Question                         | Beginner Approach             | Optimized / Pattern |
| --- | -------------------------------- | ----------------------------- | ------------------- |
| 12  | Naive pattern searching          | Check every substring in text | -                   |
| 13  | KMP / Rabin-Karp string matching | -                             | KMP / Rolling hash  |

**Implementation**: `PatternSearching.java`

---

### 7. Advanced Patterns

| #   | Question                                  | Beginner Approach        | Optimized / Pattern             |
| --- | ----------------------------------------- | ------------------------ | ------------------------------- |
| 14  | Longest substring without repeating chars | Sliding window + HashSet | Sliding window + HashMap (O(n)) |

**Implementation**: `AdvancedStringPatterns.java`

---

### How to Use

1. Open the Java file for the topic.
2. Implement the beginner solution first (marked with `TODO`).
3. Implement the optimized solution.
4. Run via `javac strings/<File>.java` and `java <File>` (files have default package).
5. Document time/space complexity for both versions in comments.
