package Leetcode;

public class TypeofTriangle_3024 {
    public static void main(String[] args) {
        int[] nums = {8,4,2};
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if (!(((a + b) > c) && ((a + c) > b) && ((b + c) > a))) {
            System.out.println("none");
            return;
        }

        if (a == b) {
            if (b == c) {
                System.out.println("equilateral");
                return;
            }
        }
        if (a == b || a == c) {
            System.out.println("isosceles");
            return;
        }
        if (a != b) {
            if (b != c) {
                System.out.println("scalene");
                return;
            }
        }
        System.out.println("none");
    }
}
