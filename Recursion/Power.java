package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(FindThePower(3, 4));
    }

    private static int FindThePower(int a, int b) {
        if (b == 0) return 1;
        return a * FindThePower(a, b - 1);
    }
}
