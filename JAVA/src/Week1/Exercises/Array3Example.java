package Week1.Exercises;
import java.util.Scanner;
import java.util.Arrays;

public class Array3Example {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] number = new int[size];

        System.out.print( " Please enter " + size + "number");
        for ( int i = 0; i < size ; i++) {
            System.out.println( (i+1) + ". number is: ");
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number);

        for ( int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}
