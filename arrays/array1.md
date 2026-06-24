
# Find Maximum and Second Maximum Element in an Array

## Problem Statement

Given an array of integers, find:

1. The maximum element in the array.
2. The second maximum element in the array.

### Example

**Input:**

```java
{3, 9, 7, 8, 12, 6, 15, 5, 4, 10}
```

**Output:**

```java
The maximum value in the array is: 15
The second maximum value in the array is: 12
```

---

## Approach

### Finding the Maximum Element

1. Assume the first element is the maximum.
2. Traverse the array from the second element.
3. If the current element is greater than the current maximum, update the maximum.
4. After completing the traversal, return the maximum value.

### Finding the Second Maximum Element

1. Maintain two variables:

   * `max1` → Largest element found so far.
   * `max2` → Second largest element found so far.
2. Traverse the array.
3. If the current element is greater than `max1`:

   * Move `max1` to `max2`.
   * Update `max1` with the current element.
4. Otherwise, if the current element is smaller than `max1` but greater than `max2`:

   * Update `max2`.
5. After completing the traversal, `max2` will contain the second largest element.

---

## Dry Run

### Initial Values

```java
max1 = 3
max2 = 3
```

### Iteration

| Element | max1 | max2 |
| ------- | ---- | ---- |
| 9       | 9    | 3    |
| 7       | 9    | 7    |
| 8       | 9    | 8    |
| 12      | 12   | 9    |
| 6       | 12   | 9    |
| 15      | 15   | 12   |
| 5       | 15   | 12   |
| 4       | 15   | 12   |
| 10      | 15   | 12   |

### Final Result

```java
Maximum Element = 15
Second Maximum Element = 12
```

---

## Time Complexity

### max()

```text
O(n)
```

The array is traversed once.

### secondMax()

```text
O(n)
```

The array is traversed once.

---

## Space Complexity

### max()

```text
O(1)
```

### secondMax()

```text
O(1)
```

Only a few variables are used regardless of array size.

---

## Key Learning

* How to traverse an array efficiently.
* How to track the largest and second-largest elements in a single pass.
* Importance of optimizing solutions to avoid multiple traversals.
* Understanding time and space complexity analysis.

---

## Java Solution

```java
public class array1 {

    static int max(int A[]) {

        int max = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        return max;
    }

    static int secondMax(int A[]) {
        int max1 = A[0];
        int max2 = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] < max1 && A[i] > max2) {
                max2 = A[i];
            }
        }

        return max2;
    }

    public static void main(String[] args) {

        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        System.out.println("The maximum value in the array is: " + max(A));
        System.out.println("The second maximum value in the array is: " + secondMax(A));
    }
}
```
