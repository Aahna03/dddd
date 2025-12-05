# BasicSortingNotes

📌 **Bubble Sort**

Bubble Sort works by repeatedly comparing adjacent elements and swapping them if they are in the wrong order.
It uses two loops:

🔹 Outer Loop

Runs the sorting process for each pass.

🔹 Inner Loop

Compares each element with its next element.

To prevent comparing already sorted elements (the largest ones “bubble up” to the end after each pass), the inner loop runs for:

j < n - 1 - i //This is an important DSA pattern

This ensures that with every pass, the inner loop covers one less element, because the last elements are already sorted.

📌 **Selection Sort**

Selection Sort works by repeatedly selecting the minimum element from the unsorted portion of the array and placing it in its correct position.

Here’s how the logic works:

In the outer loop, we assume the first unsorted element (at index i) is the minimum, so we set minIndex = i.

In the inner loop, we compare every element in the unsorted portion with arr[minIndex].

If we find an element smaller than the current minimum, we update minIndex to this new position.

After the inner loop ends, minIndex now holds the index of the smallest element in the unsorted part.

Finally, we swap arr[i] with arr[minIndex] to place the minimum element at its correct sorted position.

This process continues until the entire array becomes sorted.
