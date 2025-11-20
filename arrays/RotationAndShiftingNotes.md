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
