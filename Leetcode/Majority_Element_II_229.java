package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_Element_II_229 {
    public static void main(String[] args) {
        majorityElement(new int[]{3, 2, 3});
    }

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (ele.getValue() > nums.length / 3) {
                list.add(ele.getKey());
            }
        }
        System.out.println(list);

        return list;
    }
}
