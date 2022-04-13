import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a fact :");
        int x =scan.nextInt();
        int i;
        int fact=1;

        for (i=1;i<=x;i++){
            fact = fact * i;
        }
        System.out.println("factorial of Given No is :"+ " " + fact);
    }
}
