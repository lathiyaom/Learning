package Stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        // post to infix
        String s = "ab+cd-*e/";
        Stack<String> stack = new Stack<>();


        for(int i=0; i<s.length(); i++){

            if(isOperator(s.charAt(i))){
                String right = stack.pop();
                String left = stack.pop();
                String news = "(" + left + s.charAt(i) + right +")";
                stack.push(news);
            }
            else{
                stack.push(s.charAt(i) + "");
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