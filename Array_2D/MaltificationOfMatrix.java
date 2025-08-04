package Array_2D;

public class MaltificationOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        }; // 2x3

        int[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        }; // 3x2

        int rowsA = matrix.length;
        int colsA = matrix[0].length;
        int rowsB = matrix2.length;
        int colsB = matrix2[0].length;

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] ans = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    ans[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
