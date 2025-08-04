package Leetcode;

import java.util.ArrayList;

public class PascalsTriangle_118 {
    public static void main(String[] args) {
        int numRows = 2;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> h1 = new ArrayList<>();
        h1.add(1);
        ans.add(h1);
        if (numRows == 1) {
            System.out.println(ans);
        }
        for (int i = 1; i < numRows; i++) {
            h1 = GenrateThePascal(h1);
            ans.add(h1);
        }
//        for (ArrayList<Integer> a : ans) {
//            System.out.println(a);
//        }
    }

    public static ArrayList<Integer> GenrateThePascal(ArrayList<Integer> arrayList) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arrayList.get(0));
        for (int i = 0; i < arrayList.size() - 1; i++) {
            ans.add(arrayList.get(i) + arrayList.get(i + 1));
        }
        ans.add(arrayList.get(arrayList.size() - 1));
        return ans;
    }
}
