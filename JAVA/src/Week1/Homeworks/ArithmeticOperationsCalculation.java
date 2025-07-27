package Week1.Homeworks;
import java.util.Scanner;

public class ArithmeticOperationsCalculation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        double result = number1 + number2 * number3 - number2;
        System.out.print("Result: " + result);

    }
}
