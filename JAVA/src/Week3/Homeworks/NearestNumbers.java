package Week3.Homerworks;

import java.util.ArrayList;

public class NearestNumbers {

    public static void main (String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(10);

        numbers.add(1);
        numbers.add(74);
        numbers.add(82);
        numbers.add(5);
        numbers.add(16);
        numbers.add(97);
        numbers.add(108);
        numbers.add(35);
        numbers.add(47);
        numbers.add(23);

        System.out.println("Oluşturduğumuz dizi şu şekildedir : " + numbers);

        int min1 = numbers.get(0);
        int min2 = numbers.get(1);
        int mindiff = Math.abs(min1 - min2);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int diff = Math.abs(numbers.get(i) - numbers.get(j));

                if (diff < mindiff) {
                    mindiff = diff;
                    min1 = numbers.get(i);
                    min2 = numbers.get(j);
                }
            }
        }

        System.out.println("Birbirine en yakın iki sayı = " + min1 + " ve " + min2);
    }
}
