package Pattern;

public class P5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        int trows = n - 1;
        int stars = n - 1;
        int space = 1;
        for (int row = 1; row <= trows; row++) {
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            for (int csp = 1; csp <= space; csp++) {
                System.out.print(" ");
            }
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("*");
            }
            System.out.println();
            space += 2;
            stars--;
        }
    }
}
