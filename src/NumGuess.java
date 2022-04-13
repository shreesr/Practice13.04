import java.util.Scanner;

public class NumGuess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNo = (int) (Math.random() * 100);

        int userNo;
        do {
            System.out.println("Guess the no : ");
            userNo = sc.nextInt();

            if (userNo == myNo) {
                System.out.println("Whooo..  CORRECT NUMBER ! ");
                break;
            } else if (userNo > myNo) {
                System.out.println("Your no is too Large.");
            } else {
                System.out.println("Your no is too Small.");

            }

        } while (userNo >= 0);

    }
    }








