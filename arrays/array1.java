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
    static int secondMax(int A[]){
        int max1= A[0];
        int max2= A[0];
        for(int i=1; i<A.length; i++){
            if(A[i]>max1){
                max2 = max1; 
                max1 = A[i];
            }else if(A[i]<max1 && A[i]>max2){
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