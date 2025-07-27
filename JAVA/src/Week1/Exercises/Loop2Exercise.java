package Week1.Exercises;
import java.util.Scanner;

public class Loop2Exercise {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a value:");
        int value = scanner.nextInt();

        for ( int i = 0; i<=value; i++) {
            if( i %2 == 0) {
                System.out.println ( i + " is even.");
            }
            else {
                System.out.println( i + " is odd.");
            }
        }
    }
}
