package Week2.Exercises.Practices;
import java.util.Scanner;

//palindrom -> 212 = 212

public class PalindromNumberExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        boolean isPalindromNumber = isPalindrom(number);

        if(isPalindromNumber) {
            System.out.println("this number is palindrom.");
        } else {
            System.out.println("this number is not palindrom.");
        }


    }

    private static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while(number > 0) {
            int digit = number % 10 ;
            reverseNumber = (reverseNumber * 10) + digit;
            number /= 10;
        }
        return originalNumber == reverseNumber;

    }


}
