package Leetcode;

import java.util.Arrays;

public class Move_Zeroes_283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 0, 3, 12, 7});
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int nonZeroIndex = findTheIndexOfNonZero(nums, i + 1);
                if (nonZeroIndex == -1) continue;
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int findTheIndexOfNonZero(int[] arr, int i) {
        while (i < arr.length) {

            if (arr[i] != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}

