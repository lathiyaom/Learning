import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        System.out.println(NoOfGcd());
    }

    public static int NoOfGcd() {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();

        for (int i = 1; i <= 2; i++) {
            ans = GCD(ans, sc.nextInt());

        }
        return ans;

    }
}
