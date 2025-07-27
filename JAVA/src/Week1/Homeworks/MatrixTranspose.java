package Week1.Homeworks;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a row: ");
        int row = scanner.nextInt();
        System.out.println("Please enter a column: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Please enter matrix numbers: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
                System.out.print("A[" + i + "][" + j + "] =  " + matrix[i][j] + "  ");
                System.out.print("Transpose A[" + j + "][" + i + "] =  " + transpose[j][i] + "\n");
            }
        }

        System.out.println("\nOriginal matrix is:");
        printMatrix(matrix);

        System.out.println("\nTransposed matrix is:");
        printMatrix(transpose);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
