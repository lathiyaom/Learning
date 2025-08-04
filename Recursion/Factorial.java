package Recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(FindTheFeactorial(5));
    }

    private static int FindTheFeactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * FindTheFeactorial(n - 1);
    }
}
