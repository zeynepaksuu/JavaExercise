package Week1.Homeworks;
import java.util.Scanner;

public class ChineseZodiacCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birth year: ");
        int year = scanner.nextInt();

        int value = year % 12;

        String zodiac = switch (value) {
            case 0  -> "Monkey";
            case 1  -> "Rooster";
            case 2  -> "Dog";
            case 3  -> "Pig";
            case 4  -> "Rat";
            case 5  -> "Ox";
            case 6  -> "Tiger";
            case 7  -> "Rabbit";
            case 8  -> "Dragon";
            case 9  -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> "Unknown";
        };

        System.out.println("Your Chinese zodiac sign is: " + zodiac);

        scanner.close();
    }
}
