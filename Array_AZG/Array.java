package Array_AZG;


public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int even = 0;
        for (int val : arr) {
            if (val % 2 == 0) {
                even++;
            }
        }
        System.out.println("No of Odd   " + (arr.length - even));
        System.out.println("no of Even  " + even);

    }
}
