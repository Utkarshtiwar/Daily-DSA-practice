# Matrix Addition and Matrix Multiplication in Java

## Problem Statement

Implement two fundamental matrix operations:

1. **Matrix Addition**
2. **Matrix Multiplication**

The program takes two `3 × 3` matrices as input and performs both operations separately.

---

# Matrix Addition

## Concept

Matrix addition is the simplest matrix operation.

To add two matrices:

* Both matrices must have the **same number of rows and columns**.
* Each element is added to the element at the **same position**.

### Formula

```text
C[i][j] = A[i][j] + B[i][j]
```

### Example

```text
Matrix A

1 2 3
4 5 6
7 8 9

Matrix B

9 8 7
6 5 4
3 2 1
```

Result

```text
10 10 10
10 10 10
10 10 10
```

---

## Logic Behind Matrix Addition

1. Create a new matrix `C`.
2. Traverse every row.
3. Traverse every column.
4. Add the corresponding elements from both matrices.
5. Store the result in matrix `C`.

Since every element is visited exactly once, the solution is efficient and easy to understand.

---

## Time Complexity

```text
O(n²)
```

Each element is processed once.

## Space Complexity

```text
O(n²)
```

A new matrix is created to store the result.

---

# Matrix Multiplication

## Concept

Matrix multiplication is different from matrix addition.

Instead of adding corresponding elements, we:

* Take one row from Matrix A.
* Take one column from Matrix B.
* Multiply corresponding elements.
* Add all the products together.

The final sum becomes one element in the result matrix.

---

## Matrix Multiplication Rule

Matrix multiplication is only possible when:

```text
Columns of Matrix A = Rows of Matrix B
```

For this program:

```text
3 × 3  ×  3 × 3

Result = 3 × 3
```

---

## Formula

```text
C[i][j] = Σ (A[i][k] × B[k][j])
```

---

## Dry Run

To calculate:

```text
C[0][0]
```

First row of Matrix A

```text
1 2 3
```

First column of Matrix B

```text
9
6
3
```

Multiply

```text
1 × 9 = 9
2 × 6 = 12
3 × 3 = 9
```

Add

```text
9 + 12 + 9 = 30
```

Therefore,

```text
C[0][0] = 30
```

The same process is repeated for every element in the result matrix.

---

# Understanding the Three Loops

The multiplication method contains three nested loops.

### Outer Loop (`i`)

```java
for(int i = 0; i < rowsA; i++)
```

Moves through each **row** of Matrix A.

---

### Middle Loop (`j`)

```java
for(int j = 0; j < colsB; j++)
```

Moves through each **column** of Matrix B.

---

### Inner Loop (`k`)

```java
for(int k = 0; k < colsA; k++)
```

This loop performs the actual multiplication.

It:

* Multiplies corresponding elements.
* Adds their product into the variable `sum`.
* Stores the final value inside `C[i][j]`.

This loop is the heart of matrix multiplication.

---

## Why is `sum` Needed?

```java
int sum = 0;
```

Each element of the result matrix is the sum of several multiplications.

Example:

```text
(1×9) + (2×6) + (3×3)
```

Instead of storing every multiplication separately, we keep adding them into `sum`.

Finally,

```java
C[i][j] = sum;
```

stores the completed value.

---

# Output

## Matrix Multiplication

```text
30 24 18
84 69 54
138 114 90
```

## Matrix Addition

```text
10 10 10
10 10 10
10 10 10
```

---

# Time Complexity

## Matrix Addition

```text
O(n²)
```

## Matrix Multiplication

```text
O(n³)
```

Reason:

* First loop → Rows
* Second loop → Columns
* Third loop → Multiplication and summation

Three nested loops result in cubic time complexity.

---

# Space Complexity

## Matrix Addition

```text
O(n²)
```

## Matrix Multiplication

```text
O(n²)
```

The only extra space used is the result matrix.

---

# Key Learnings

* Difference between matrix addition and matrix multiplication.
* Understanding how nested loops work together.
* Importance of row-column matching in matrix multiplication.
* How intermediate values are accumulated using a `sum` variable.
* Time and space complexity analysis of matrix operations.
* Writing clean and modular Java methods for different matrix operations.

---

## Files Included

* `matrixMultiplication.java` - Java implementation of Matrix Addition and Matrix Multiplication.
* Demonstrates separate methods for both operations.
* Includes sample input and output for easy understanding.

---

## Author

**Utkarsh Tiwari**

Daily DSA Practice Repository

Building strong problem-solving skills through consistent practice, clean code, and detailed explanations.
