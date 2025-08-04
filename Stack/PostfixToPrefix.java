package Stack;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        // post to pre
        String s = "abc+cd*/";
        // /+ab*cd
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(isOperator(ch)){
                String left = stack.pop();
                String right = stack.pop();
                String ans = ch + right + left;
                stack.push(ans);
            } else{
                stack.push(ch + "");
            }
        }

        System.out.println(stack.peek());
    }

    public static boolean isOperator(char c){
        if(c=='+' || c=='-' || c=='/' || c=='*' || c=='%'){
            return true;
        }
        return false;
    }
}