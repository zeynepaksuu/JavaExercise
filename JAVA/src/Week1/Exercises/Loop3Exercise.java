package Week1.Exercises;
import java.util.Scanner;

public class Loop3Exercise {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a value: ");
        int value = scanner.nextInt();
        boolean isPrime = true;
        for ( int i = 2; i <= value ; i++) {
            if ( value % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("This number is prime number.");
        } else {
            System.out.println("This number is not prime number.");
        }
    }

}

