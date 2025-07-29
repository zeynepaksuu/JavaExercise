package Week2.Homeworks;
import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("this number is not prime number. ");
        } else if (isPrime(number)) {
            System.out.println("this number is prime number.");
        } else {
            System.out.println("this number is not prime number");
        }
    }

    private static boolean isPrime(int number){
        return checkPrime(number, 2);
    }

    private static boolean checkPrime (int number, int i) {
        if ( i * i > number) {
            return true;
        }
        if( number % i == 0) {
            return false;
        }
        return checkPrime(number, i +1);
    }
}
