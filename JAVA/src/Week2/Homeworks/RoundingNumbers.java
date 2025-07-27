package Week2.Homeworks;
import java.util.Scanner;

public class RoundingNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a double type value: ");
        double value = scanner.nextDouble();

        System.out.println("Round down: " + Math.floor(value));
        System.out.println("Round up: " + Math.ceil(value));
        System.out.println("Round to the nearest integer number: " + Math.round(value));

    }
}
