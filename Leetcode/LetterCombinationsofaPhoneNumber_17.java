package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber_17 {
    public static String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        String digits = "23";
        f(digits, 0, "");
        System.out.println(ans);
    }

    private static void f(String digits, int i, String output) {
        if (i == digits.length()) {
            ans.add(output);
            return;
        }
        int digit = digits.charAt(i) - '0';
        for (int j = 0; j < map[digit].length(); j++) {
            f(digits, i + 1, output + map[digit].charAt(j));

        }
    }
}
