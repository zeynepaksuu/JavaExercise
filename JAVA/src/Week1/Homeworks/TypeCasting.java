package Week1.Homeworks;
import java.util.Scanner;

public class TypeCasting {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a integer value: ");
        int value1 = scanner.nextInt();
        System.out.print("Please enter a double type value: ");
        double value2= scanner.nextDouble();

        double newvalue1 = value1;
        int newvalue2 = (int) value2;

        System.out.print("new double value is :" + newvalue1);
        System.out.print(" new integer value is : " + newvalue2);

    }
}
