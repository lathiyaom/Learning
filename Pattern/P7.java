package Pattern;

import java.io.PrintStream;

public class P7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Logic to determine whether to print '*' or '_'
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
