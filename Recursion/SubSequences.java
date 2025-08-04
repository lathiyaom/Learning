package Recursion;

public class SubSequences {
    public static void main(String[] args) {
        PrintFunction("abc", 0, "");
    }

    private static void PrintFunction(String str, int i, String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        PrintFunction(str, i + 1, ans + str.charAt(i));
        PrintFunction(str, i + 1, ans);

    }
}
