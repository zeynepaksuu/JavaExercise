package Week1.Exercises;
import java.util.Scanner;
public class FibonacciSeriesExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a value: ");
        int number = scanner.nextInt();

        int number1 = 0;
        int number2 = 1;

        if(number < 1) {
            System.out.print("Please enter a number bigger than 1: ");
            return;
        }

        while ( number2 <= number ) {
            System.out.print(" , " + number2);
            int nextNumber = number1+number2;
            number1 = number2;
            number2 = nextNumber;
        }

    }
}
