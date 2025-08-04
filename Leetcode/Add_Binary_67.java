package Leetcode;

public class Add_Binary_67 {
    public static void main(String[] args) {
        String a = "111";
        String b = "11";

        StringBuilder ans = new StringBuilder("");
        int carry = 0;

        int ai = a.length() - 1;
        int bi = b.length() - 1;

        while (ai >= 0 || bi >= 0) {
            int bitA = (ai >= 0) ? a.charAt(ai) - '0' : 0;
            int bitB = (bi >= 0) ? b.charAt(bi) - '0' : 0;
            int sum = bitA + bitB + carry;

            ans.append(sum % 2);      // current binary digit
            carry = sum / 2;          // carry for next step

            ai--;
            bi--;
        }

        if (carry == 1) {
            ans.append("1");
        }

        System.out.println(ans.reverse().toString());
    }
}
