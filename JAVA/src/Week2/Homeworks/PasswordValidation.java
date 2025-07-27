package Week2.Homeworks;
import java.util.Scanner;

public class PasswordValidation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter a password:");
        String password = scanner.nextLine();

        boolean valid = true;
        if (password.length() < 8) {
            valid = false;
        }

        for (int i = 0; i < password.length(); i++) {
            if ( password.charAt(i) == ' ') {
                valid = false;
                break;
            }
        }
        char firstChar = password.charAt(0);
        if (!(firstChar >= 'A' && firstChar <= 'Z')) {
            valid = false;
        }
        if (password.charAt(password.length() - 1) != '?') {
            valid = false;
        }

        if (valid) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password");
        }
    }
}
