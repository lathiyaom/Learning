package Leetcode;

public class TwoSumInputArrayIsSorted_167 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {

            if (arr[l] < target - arr[r]) {
                l++;
            } else if (arr[r] > target - arr[l]) {
                r--;
            } else {
                System.out.println((l + 1) + " " + (r + 1));
                return;
            }
        }
    }
}
