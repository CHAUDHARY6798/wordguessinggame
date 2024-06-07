public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println();

        System.out.println("Matrix B:");
        printMatrix(B);
        System.out.println();

        int[][] result = matrixMultiplication(A, B);

        System.out.println("Result of matrix multiplication:");
        printMatrix(result);
    }

    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        int m = A.length; // Number of rows in A
        int n = A[0].length; // Number of columns in A
        int p = B[0].length; // Number of columns in B

        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
