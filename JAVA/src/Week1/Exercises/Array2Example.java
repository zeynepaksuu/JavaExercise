package Week1.Exercises;
import java.util.Scanner;

public class Array2Example {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for array size: ");
        int size = scanner.nextInt();

        int[] number = new int[size];

        System.out.print("Enter a number: ");


        for( int i = 1; i < size ; i++) {
            System.out.print( i + ". sayıyı giriniz: " );
            number[i] = scanner.nextInt();

        }

        int max = 0;
        int min = 0;

        for ( int i = 0; i < number.length; i++ ) {
            if( number[i] < min) {
                min = number[i];
            }
            if ( number[i] > max ) {
                max = number[i];
            }
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
