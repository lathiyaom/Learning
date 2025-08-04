package Leetcode;

public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(idx);
    }
}
