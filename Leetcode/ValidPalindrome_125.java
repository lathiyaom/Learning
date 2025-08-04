package Leetcode;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                System.out.println("false");
                return;
            }
            l++;
            r--;
        }
        System.out.println("true");
    }
}
