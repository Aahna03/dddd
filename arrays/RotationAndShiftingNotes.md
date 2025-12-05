**Rotation and Shifting**

1. _Shifting_: It is shifting an element in the array by ONE position to the left or right.

There are two types of shift: `Left Shift` and `Right Shift`.

`In left shifting:`

Every element moves one step to the left and the first element drops out.
_Eg:_
Original: [1, 2, 3, 4, 5]
Left Shift → [2, 3, 4, 5, _ ] <--- _Last position is filled with 0 or any variable based on question._

The first element drops out, you can store the element in another variable for future use or just drop it out.

_Eg code:---------------------------------------------_
public static void leftShift(int arr[]) {
// store the first element (if needed)
int first = arr[0];

    for (int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
    }

    // last element becomes 0 (or anything you want)
    arr[arr.length - 1] = 0;

    // print array
    for(int num : arr){
        System.out.print(num + " ");
    }

}
_-------------------------------------------------------_

`In Right Shifting:`

Every element moves one step to the right and the last element drops out.
_Eg:_
Original: [1, 2, 3, 4, 5]
Right Shift → [_, 1, 2, 3, 4]

_Eg code: ----------------------------------------------_
public static void rightShift(int arr[]) {

    // store the last value (only if needed)
    int last = arr[arr.length - 1];

    // shift elements right
    for(int i = arr.length - 1; i > 0; i--){
        arr[i] = arr[i - 1];
    }

    // fill first position with 0 (or -1 based on question)
    arr[0] = 0;

    // print shifted array
    for(int num : arr){
        System.out.print(num + " ");
    }

}
_-------------------------------------------------------_

2. _Rotation_: In rotation elements are moves to left or right, but in a `Circular` way. If something goes out on one side, it comes back on the other side.

There are two types of rotation: `Left rotation` and `Right rotation`.

`In left rotation:`
Element goes out from left and comes back in from right.

_Eg:_
Original: [1, 2, 3, 4, 5]
Left Rotate 1 → [2, 3, 4, 5, 1]

_Eg code:-------------------------------------------------_
<Left rotation by one>
public static void leftRotateByOne(int arr[]) {

    int first = arr[0];  // store the first element

    // shift everything left by 1
    for(int i = 0; i < arr.length - 1; i++){
        arr[i] = arr[i + 1];
    }

    // put the first element at the end
    arr[arr.length - 1] = first;

    // print array
    for(int num : arr){
        System.out.print(num + " ");
    }

}
_---------------------------------------------------------_

`In right rotation:`
Element goes out from right and comes back from left.

_Eg:_
Original: [1, 2, 3, 4, 5]
Right Rotate 1 → [5, 1, 2, 3, 4]

_Eg code:--------------------------------------------------_
<Right rotate by one>
public static void rightRotateByOne(int arr[]) {

    int last = arr[arr.length - 1];  // store last element

    // shift elements to the right
    for (int i = arr.length - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
    }

    // place last element at the front
    arr[0] = last;

    // print array
    for(int num : arr){
        System.out.print(num + " ");
    }

}
_------------------------------------------------------------_

3. _Rotation by k steps_
   There is a formula for rotation by k steps which gives how many times the rotation by 1 step array should run to give rotation by k steps
   _Eg:_
   arr= {1,2,3,4,5,6,7}
   k=12;
   so we have to rotate the array by 12 steps;
   Output should be: {6,7,1,2,3,4,5}

`But how many rotations should be done to obtain 12 steps ?`
we use the formula= k%arr.length;

`Why do we use % arr.length?`
_Because rotating an array by its own length does NOTHING._
_EG:_
[1, 2, 3, 4, 5]
Rotate left by 5:
→ [1, 2, 3, 4, 5] (same)
Rotate left by 10:
→ 10 % 5 = 0 → same as rotating 0 times

_Practical eg1_
arr = [1,2,3,4,5]
target = 12
Rotate left by 12?
We don’t rotate 12 times.
Because:
12 % 5 = 2
So it is same as rotating 2 times.

_Practical eg2_
arr = [1,2,3,4,5,6,7]
target = 100
Rotate 100 times?
No.
100 % 7 = 2
So you only rotate 2 times.

_Why do we need this?_
Without this line:
Your brute-force code would repeat a LOT of unnecessary rotations.
_Example:_
Rotate by 100:
100 rotations × 7 elements = 700 operations
With modulo:
2 rotations × 7 elements = 14 operations

`Let's understand this visually`
Imagine this array:
Index: 0 1 2 3 4
Array: [1, 2, 3, 4, 5]
Length = 5
_Case 1 — Rotate Left by 1_
Rotate by 1 → [2, 3, 4, 5, 1]
_Case 2 — Rotate Left by 5 (same as length)_
Rotate by 5 → [1, 2, 3, 4, 5] (BACK TO ORIGINAL)
Why?
Because after rotating 5 times, every element comes back to the same place.
So:
Rotate by _5_ = Rotate by _0_
_Case 3 — Rotate Left by 6_
6 rotations = 5 rotations + 1 rotation
But 5 rotations = no change.
_Diagram_
target = 6
arr.length = 5
k = target % arr.length
k = 6 % 5 = 1
So we rotate only 1 time.
