package Week1.Homeworks;
import java.util.Scanner;

public class TrianglePatternWStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and see the magic: ");
        int number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
