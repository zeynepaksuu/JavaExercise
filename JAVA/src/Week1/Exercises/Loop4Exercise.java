package Week1.Exercises;
import java.util.Scanner;

public class Loop4Exercise {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a value: ");
        int value = scanner.nextInt();
        boolean isPrime = true;
        for ( int i = 0; i <= value ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }if(isPrime) {
                System.out.println( i + " is prime number "  );
            }else {
                System.out.println( i + " is not prime number "  );
            }
        }
    }
}
