package Week1.Exercises;
import java.util.Scanner;

public class LoopExercise {
    public static void main ( String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter a value: ");
        int value = scanner.nextInt();

        if( value %2 == 0) {
            System.out.println("This number is even.");
        }
        else {
            System.out.println("This number is odd.");
        }
    }
}
