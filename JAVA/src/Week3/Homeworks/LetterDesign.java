package Week3.Homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterDesign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> letters = new ArrayList<>();

        letters.add("z");
        letters.add("e");
        letters.add("y");
        letters.add("n");

        System.out.println("Default olarak oluşturulmuş liste: " + letters);

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + ". harfi giriniz: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("Lütfen sadece 1 harf giriniz.");
                i--;
                continue;
            }

            String letter = input.toLowerCase();

            if (letters.contains(letter)) {
                int index = letters.indexOf(letter);
                letters.set(index, "found");
            } else {
                System.out.println("Harf listede yok.");
            }
        }

        System.out.println("Yeni liste: " + letters);
    }
}
