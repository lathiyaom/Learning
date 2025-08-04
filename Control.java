import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        System.out.println(NoOfGcd());
    }

    public static int GCD(int A, int B) {
        for (; A != 0; ) {
            int A_ = B % A;
            int B_ = A;
            A = A_;
            B = B_;
        }
        return B;
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
