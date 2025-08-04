package Week3.Exercises.MapExamples.MapSamples.MapSamples2;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main (String[] args) {
        TreeMap<Integer, String> numbers = new TreeMap<>();

        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");

        System.out.println("Son değer: " + numbers.lastKey());
        System.out.println("İlk değer: " +numbers.firstKey());

        System.out.println("4 Var mı ? : " +numbers.containsKey(4));
        System.out.println("8 Var mı ? : " +numbers.containsKey(8));


        System.out.println("Sayılar :  " +numbers);


    }
}
