package Recursion;

public class MaxElementFromArray {
    public static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] arr = {100, 4, 2};
        System.out.println(FindMaxFromArray(arr, 0));
    }

    private static int FindMaxFromArray(int[] arr, int i) {
        if (i >= arr.length) {
            return MAX;
        }
        MAX = Math.max(MAX, arr[i]);
        return FindMaxFromArray(arr, i + 1);
    }
}
