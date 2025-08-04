package Leetcode;

public class LargestSubstringBetweenTwoEqual_1624 {
    public static void main(String[] args) {
        String str = "ojdncpvyneq";
        int[] index = new int[26];
        int maxlen = -1;
        for (int i = 0; i < str.length(); i++) {
            int currentfreq = str.charAt(i) - 'a';
            if (index[currentfreq] > 0) {
                //
                maxlen = Math.max(maxlen, i - index[currentfreq]);
            } else {
                index[currentfreq] = i + 1;
            }
        }
        System.out.println(maxlen);
    }
}
