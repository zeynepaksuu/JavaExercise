package Week1.Exercises;
import java.util.Scanner;

public class TempratureExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the temperature in degrees Celsius: ");
        double celcius = scanner.nextDouble();

        //F = (C * 1.8 + 32)

        double fahrenheit = celcius * 1.8 + 32;

        System.out.println(" Temprature in degrees fahrenheit is:  " + fahrenheit);
    }
}
