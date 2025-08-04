package Leetcode;

import java.util.HashMap;

public class Contains_Duplicate_II_219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        [1,2,3,1], k = 3
//           0 1 2 3

//            1->0
//            2->1
//            3->2
//            1->3
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean isPresent = false;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int absValue = Math.abs(map.get(nums[i]) - i);
                System.out.println(absValue);
                if (absValue <= k) {
                    isPresent = true;
                }
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }
        return isPresent;
    }
}
