package Week1.Exercises;
import java.util.Scanner;

public class Array4Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array size: ");
        int size = scanner.nextInt();

        int[] number = new int[size];

        System.out.println("Please enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". number is: ");
            number[i] = scanner.nextInt();
        }

        System.out.print("Please enter a value to search: ");
        int value = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == value) {
                count++;
            }
        }

        System.out.println("This number appears " + count + " time(s) in the array.");
    }
}
