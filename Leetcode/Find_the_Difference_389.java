package Leetcode;

import java.util.Arrays;

public class Find_the_Difference_389 {
    public static void main(String[] args) {
        findTheDifference("abcd", "abcde");
    }

    public static char findTheDifference(String s, String t) {
        int[] frq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            frq[t.charAt(i) - 'a']--;
        }
        System.out.println(Arrays.toString(frq));
        for (int i = 0; i < frq.length; i++) {
            if (frq[i] <= -1) {
                char character = (char) ('a' + i);
                return character;
            }
        }
        return ' ';
    }
}
