package Recursion;

public class mazPath {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        findTheAllPossiblePath(0, 0, m, n, "");
    }

    private static void findTheAllPossiblePath(int i, int j, int m, int n, String ans) {
        if (i == m - 1 && j == n - 1) {
            System.out.println(ans);
            return;
        }
        if (i >= m || j >= n) return;
        findTheAllPossiblePath(i, j + 1, m, n, ans + "R");
        findTheAllPossiblePath(i + 1, j, m, n, ans + "D");
    }
}
