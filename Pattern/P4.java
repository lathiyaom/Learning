package Pattern;

public class P4 {

    public static void main(String[] args) {
        int n = 7;
//        int trows = n;
//        int space = n / 2;
//        int stars = 1;
//        for (int row = 1; row <= trows; row++) {
//            for (int csp = 1; csp <= space; csp++) {
//                System.out.print(" ");
//            }
//            for (int cst = 1; cst <= stars; cst++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            if (row <= trows / 2) {
//                space--;
//                stars += 2;
//            } else {
//                space++;
//                stars -= 2;
//            }
//        }



        printTheUpper(n);
       below(n);
    }
    public static void printTheUpper(int n){
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
    }

    public static void below(int n){
        n=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n/2;j++){
                System.out.print("*");
            }
            for(int p=1;p<=i;p++){
                System.out.print(" ");
            }
            for(int j=1;j<=n/2;j++){
                System.out.print("*");
            }
        }
    }
}
