package Leetcode;

public class RotateImage48 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;
        //rev cols
        for (int col = 0; col < n; col++) {
            int i = 0;
            int j = n - 1;

            while (i < j) {
                int temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
                i++;
                j--;
            }
        }
    }
}
