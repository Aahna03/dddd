⭐ 📌 **Subarrays — Notes**
`Definition`

A subarray is a *continuous* (contiguous) part of an array.
It is defined by choosing a start index and an end index, where:

~start ≤ end~


And taking all elements between them.

*Example for arr* = [1,2,3]:

[1]
[1,2]
[1,2,3]
[2]
[2,3]
[3]


These are all the continuous slices of the array.

⭐ **Key Properties**

Subarrays are always contiguous

Order does not change

Number of subarrays in an array of size n is:

*n * (n + 1) / 2*


*Example:*
If n = 3 → 6 subarrays

⭐ **How to Generate All Subarrays?**

Use two loops:

🟦 Outer loop → choose start index
🟧 Inner loop → choose end index

For every pair (start, end) print elements from start to end.

⭐ Pattern to Remember
for (start = 0; start < n; start++) {
    for (end = start; end < n; end++) {
         print arr[start...end]
    }
}


This is the standard brute-force pattern for ALL subarray-based problems.

⭐ Why use two loops?

Because each subarray is uniquely identified by:

A start index

An end index

So we must try all possible pairs.

⭐ Common Subarray Questions

Print all subarrays (Brute force)

Maximum subarray sum (Kadane’s Algorithm)

Subarray with given sum

Count subarrays with sum K

Longest subarray with sum K

All subarrays of size K (Sliding Window)

⭐ Important: Subarray vs Subsequence
Feature	Subarray	Subsequence
Continuous?	✔ Yes	❌ No
Keep order?	✔ Yes	✔ Yes
Can skip elements?	❌ No	✔ Yes

Example for [1,2,3]:

Subarray cannot be [1,3]

Subsequence can be [1,3]

⭐ Where Subarray is used?

Sliding Window problems

Prefix Sum problems

Kadane’s algorithm

HashMap frequency patterns

Maximum sum problems

Understanding subarrays deeply makes later topics much easier.