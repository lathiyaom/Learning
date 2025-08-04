package Leetcode;

public class NextPermutation_31 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int i = arr.length - 1;
        while (i >= 0 && arr[i + 1] <= arr[i]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {

            }
        }
    }
}
