package Week1.Exercises;
import java.util.Scanner;

public class BasicCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second value: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter operation ( + , - , / , *: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+' :
                System.out.println("Result: " + (number1 + number2));
            break;
            case '-' :
                System.out.println("Result: " + (number1 - number2));
                break;
            case '/' :
                if (number2 != 0) {
                System.out.println("Result: " + (number1 / number2)); }
                else {
                    System.out.println("The second number cannot be zero in division.");
                }
                break;
            case '*' :
                System.out.println("Result: " + (number1 * number2) );
                break;
            default:
                System.out.println("You entered an invalid value or sign!");
        }
    }
}
