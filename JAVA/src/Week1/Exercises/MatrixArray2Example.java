package Week1.Exercises;
import java.util.Scanner;

public class MatrixArray2Example {
    public static void main (String[] args) {

        int[][] matrix = {
                { 10, 20, 30}, // [0,0] [0,1] [0,2]
                { 40, 50, 60}, // [1,0] [1,1] [1,2]
                { 70, 80, 90}  // [2,0] [2,1] [2,2]
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int value = scanner.nextInt();

        for ( int i = 0; i < matrix.length ; i++) {
            for ( int j = 0; j < matrix[i].length ; j++) {
                if ( value == matrix[i][j]) {
                    System.out.print("Rows= "+ i + " coloumn =" + j);
                    break;
                }

            }

        }


    }
}
