public class binaryToDecimal {
    public static void main(String[] args) {
        int n = 6;
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= i; p++) {
                System.out.print(k++);
            }
            for (int p = 1; p <= i - 1; p++) {
                System.out.print(k - p - 1);
            }
            k = i + 1;
            System.out.println();
        }
    }
}