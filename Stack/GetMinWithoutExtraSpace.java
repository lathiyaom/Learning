package Stack;

import java.util.Stack;

public class GetMinWithoutExtraSpace {
    private static long min;

    public static void main(String[] args) {
        Stack<Long> stack = new Stack<>();
        long min = Long.MAX_VALUE;

        // Test sequence
        min = push(stack, min, 5);
        min = push(stack, min, 7);
        min = push(stack, min, 2);
        min = push(stack, min, 1);
        System.out.println(min);
        min = pop(stack, min);
        min = pop(stack, min);
        System.out.println("Current min: " + min);
    }

    // Push element with min tracking
    public static long push(Stack<Long> stack, long min, int val) {
        long value = val;
        if (stack.isEmpty()) {
            stack.push(value);
            min = value;
        } else if (value < min) {
            stack.push(2 * value - min);
            min = value;
        } else {
            stack.push(value);
        }
        return min;
    }

    // Pop element and restore min if needed
    public static long pop(Stack<Long> stack, long min) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return min;
        }

        long top = stack.pop();
        if (top < min) {
            // This means min is encoded; recover previous min
            long oldMin = min;
            min = 2 * min - top;
            System.out.println("Popped (encoded): " + oldMin);
        } else {
            System.out.println("Popped: " + top);
        }
        return min;
    }
}
