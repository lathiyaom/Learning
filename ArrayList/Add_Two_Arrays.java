package ArrayList;

import java.util.ArrayList;

public class Add_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {9, 6};
        int[] arr2 = {1, 9};
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int rem = 0;
        while (i >= 0 && j >= 0) {
            int res = arr1[i] + arr2[j] + rem;
            if (res / 10 == 1) {
                ans.add(res % 10);
                rem = res / 10;
            } else {
                ans.add(res);
                rem = 0;
            }
            i--;
            j--;
        }
        if (rem != 0) {
            ans.add(rem);

        }
        System.out.println(ans);
    }
}
