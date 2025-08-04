package Leetcode;

import java.util.ArrayList;

public class Baseball_Game_682 {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"1", "C"}));
    }

    public static int calPoints(String[] operations) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int l1 = ans.get(ans.size() - 1);
                int l2 = ans.get(ans.size() - 2);
                ans.add(l1 + l2);
            } else if (operations[i].equals("D")) {
                ans.add(ans.get(ans.size() - 1) * 2);
            } else if (operations[i].equals("C")) {
                ans.remove(ans.size() - 1); // Remove last element
            } else {
                ans.add(Integer.parseInt(operations[i]));
            }
        }
        int res = 0;
        for (int a : ans) {
            res += a;
        }
        return res;
    }
}
