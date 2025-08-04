package Leetcode;

import java.util.Arrays;

public class BoatstoSavePeople_881 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int limit = 3;

        Arrays.sort(arr);
//1 2 2 3
        int l = 0;
        int ans = 0;
        int r = arr.length - 1;
        while (l <= r) {
            if (arr[l] + arr[r] <= limit) {
                ans++;
                l++;
                r--;
            } else {
                r--;
                ans++;
            }
        }
        System.out.println(ans);

    }
}
