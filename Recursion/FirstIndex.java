package Recursion;

public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 94};
        System.out.println(FindTheFirstIndex(arr, 0, 4));
    }

    private static int FindTheFirstIndex(int[] arr, int i, int val) {
        if (i >= arr.length) return -1;
        return (arr[i] == val) ? i : FindTheFirstIndex(arr, i + 1, val);
    }
}
