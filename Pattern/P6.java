package Pattern;

public class P6 {
    public static void main(String[] args) {
        int n = 7;
        int star = 1;
        int spaces = n - 2;
        for (int i = 1; i <= (n / 2); i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            star++;
            spaces -= 2;
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        spaces = 1;
        star = n / 2;
        for (int i = 1; i <= (n / 2); i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= star; p++) {
                System.out.print("*");
            }
            spaces += 2;
            star--;
            System.out.println();
        }
    }
}
