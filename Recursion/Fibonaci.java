package Recursion;

public class Fibonaci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(FibonaciNo(n));
    }

    private static int FibonaciNo(int n) {
        if (n <= 1) {
            return n;
        }
        return FibonaciNo(n - 1) + FibonaciNo(n - 2);
    }
}