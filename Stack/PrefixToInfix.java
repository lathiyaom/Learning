package Stack;

import java.util.Stack;


public class PrefixToInfix {
    public static void main(String[] args) {
        // pre to infix
        String s = "/++acb-cd";
        s = reverse(s);
        Stack<String> stack = new Stack<>();

//        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {

            if (isOperator(s.charAt(i))) {
                String right = stack.pop();
                String left = stack.pop();
                String news = "(" + left + s.charAt(i) + right + ")";
                stack.push(news);
            } else {
                stack.push(s.charAt(i) + "");
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

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return new String(sb);
    }

}