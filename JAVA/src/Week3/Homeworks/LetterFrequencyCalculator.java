package Week3.Homeworks;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class LetterFrequencyCalculator {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();

        //büyük kücük harf düzeltmesi icin hepsini ufak harfe ceviriyoruz
        word = word.toLowerCase();

        Map<Character, Integer> character = new HashMap<>();

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                character.put(ch, character.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : character.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        sc.close();


    }
}
