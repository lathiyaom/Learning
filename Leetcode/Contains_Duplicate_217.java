package Leetcode;

import java.util.HashSet;

public class Contains_Duplicate_217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (set.contains(a)) {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
