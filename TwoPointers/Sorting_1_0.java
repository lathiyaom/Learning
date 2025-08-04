package TwoPointers;

import java.util.Arrays;

public class Sorting_1_0 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 0};
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] == 0) {
                l++;
            } else if (arr[r] == 1) {
                r--;
            } else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
