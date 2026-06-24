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
    

    public static void main(String[] args) {

        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        System.out.println("The maximum value in the array is: " + max(A));
    }
}