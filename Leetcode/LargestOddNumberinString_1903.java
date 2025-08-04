package Leetcode;

public class LargestOddNumberinString_1903 {
    public static void main(String[] args) {
        String str = "3542790";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) % 2 != 0) {
                System.out.println(str.substring(0, i + 1));
                return;
            }
        }
    }
}
