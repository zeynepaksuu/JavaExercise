package Week2.Homeworks;
import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int n = sc.nextInt();
        int result;

        if(isLimit(n)) {
            System.out.println("Please enter only a number between 1 and 10.");
        } else {
            System.out.println("You entered a : " + n);
            multiplication(n);
        }


    }

    public static boolean isLimit(int n) {
        return n <= 0 || n > 10;
    }

    public static void multiplication(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }
    }
}
