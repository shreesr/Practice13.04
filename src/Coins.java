import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Amount: ");
        int amount = scanner.nextInt();
        int remainder ;


        if (amount / 10 != 0) {
            int coins = amount / 10;
            System.out.println("coins of 10 :" +coins);
            remainder = amount % 10;
            if (remainder / 5 != 0) {
                int coinsfive = remainder / 5;
                System.out.println("coins of 5 :" +coinsfive);
                remainder = amount % 5;
            }
            if (remainder / 2 != 0) {
                int cointwo = remainder / 2;
                System.out.println("coins of 2 :" +cointwo);
                remainder = remainder % 2;
                System.out.println("coins of 1 :" +remainder);
            }

        }

    }
}
