package Pattern;

public class Test {
    public static void main(String[] args) {
        /*
     1   *      1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6
        *
        * */


        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = (2 * i) - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
