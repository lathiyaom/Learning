package Leetcode;

import java.util.Arrays;

public class TransposeMatrix_867 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {6, 8, 9}};
        int rows = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][rows];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}
