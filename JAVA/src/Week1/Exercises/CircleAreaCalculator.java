package Week1.Exercises;
import java.util.Scanner;


public class CircleAreaCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = scanner.nextDouble();

        double PI = 3.14;

        double area = PI * radius + radius;

        System.out.print("Circle of area is: " + area);
    }
}
