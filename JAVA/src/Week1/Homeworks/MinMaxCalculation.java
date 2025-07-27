package Homeworks;
import java.util.Scanner;

public class MinMaxCalculation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter?: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);
    }
}
