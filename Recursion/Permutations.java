package Recursion;

public class Permutations {
    public static void main(String[] args) {
        PrintPermutations("abc", "");
    }

    private static void PrintPermutations(String qstr, String ans) {
        if (qstr.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < qstr.length(); i++) {
            String restString = qstr.substring(0, i) + qstr.substring(i + 1);
            PrintPermutations(restString, ans + qstr.charAt(i));
        }
    }
}
