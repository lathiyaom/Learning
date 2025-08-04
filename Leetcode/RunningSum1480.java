package Leetcode;

import java.util.Arrays;

public class RunningSum1480 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans[i] = ans[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
