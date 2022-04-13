import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a No :");
        int n =scan.nextInt();

        int i, m, remain = 0;

        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    remain = 1;
                    break;
                }
            }
            if (remain == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }
}
