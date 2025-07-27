package Week1.Homeworks;
import java.util.Scanner;

public class BodyMassIndexCalculation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height in meters and use ',' : ");
        double meters = scanner.nextDouble();

        System.out.print("Please enter your weight: ");
        double weight = scanner.nextDouble();

        double bmi = weight / ( meters * meters);

        if (bmi > 25 ) {
            System.out.println("Your body mass index: " + bmi + "and this is overweight." );
        }
        else if ( bmi <=25 && bmi>= 18.5) {
            System.out.println("Your body mass index: " + bmi + "and this is normal." );
        }
        else {
            System.out.println("Your body mass index: " + bmi + "and this is underweight." );
        }
        scanner.close();
    }
}
