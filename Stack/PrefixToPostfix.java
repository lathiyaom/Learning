package Stack;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        // pre to post
        String s = "/+ab-cd";   // d c
        // ab+cd-/
        Stack<String> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (isOperator(ch)) {
                String left = stack.pop();
                String right = stack.pop();
                String ans = left + right + ch;
                stack.push(ans);
            } else {
                stack.push(ch + "");
            }
        }

        System.out.println(stack.peek());

    }

    public static boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '/' || c == '*' || c == '%') {
            return true;
        }
        return false;
    }
}