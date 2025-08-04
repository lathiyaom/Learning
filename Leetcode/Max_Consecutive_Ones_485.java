package Leetcode;

public class Max_Consecutive_Ones_485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 0}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1 && nums[0] == 1) {
            return 1;
        }
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans = Math.max(ans, count);
                count = 0;
            } else {
                count++;
            }
        }
        return (count > ans) ? count : ans;
    }
}
