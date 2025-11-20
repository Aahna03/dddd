`Hashing – Complete Roadmap (Java)`

Mirrors Hashing_Roadmap_Beginner_vs_Optimized.csv.
Work through each topic sequentially: start with the beginner approaches, then refactor using optimal HashMap / HashSet based patterns inside your Java practice files.

Hashing Basics

# Question / Concept Beginner Approach Optimized / Pattern Insight

1 What is hashing Store key-value pairs manually in arrays Direct O(1) average lookups using HashMap/HashSet
2 HashMap / HashSet implementation concept Linear search for keys Built-in hashing + chaining/probing
3 Collision handling Basic chaining via lists Master chaining + linear/quadratic probing techniques

**Implementation**: `HashingBasics.java`

Intermediate Hashing

# Question Beginner Approach Optimized / Pattern Insight

4 Counting frequency of elements Nested loops to count HashMap with O(n) counting
5 First non-repeating character For each char, scan string again Frequency map + queue
6 Check if two strings are anagrams Sort both strings HashMap frequency comparison (O(n))

**Implementation**: `IntermediateHashing.java`

Advanced Hashing

# Question Beginner Approach Optimized / Pattern Insight

7 Subarray sum equals K Check all subarrays → O(n²) Prefix sum + HashMap → O(n)
8 Longest consecutive sequence Sort array & scan HashSet + expansion technique → O(n)
9 Group anagrams Sort each word then group manually HashMap with char-frequency signature (tuple/hash key)
10 Top K frequent elements Sort entire array HashMap + MinHeap / Bucket sort

**Implementation**: `AdvancedHashing.java`
