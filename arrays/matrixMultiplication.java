public class matrixMultiplication {
    static int[][] addition(int[][] A, int [][]B){
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        return C;
    }
    static int[][] multiplication(int[][] A, int [][] B){
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] C = new int[rowsA][colsB];
        for(int i=0; i<rowsA; i++){
            for(int j=0;j<colsB;j++){
                int sum=0;
                for (int k=0; k<colsA;k++){
                    sum+=A[i][k]*B[k][j];
                }
                C[i][j]=sum;
            }
        }
        return C;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] C = multiplication(A, B);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        

        System.out.println("##############################################");
        int [][] D = addition(A, B);
        for(int i=0;i<3; i++){
            for(int j=0;j<3;j++){
                System.out.print(D[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
