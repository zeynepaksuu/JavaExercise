package Week3.Exercises;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetTest {
    public static void main (String[] args) {
        Set<String> fruits  = new HashSet<>();
        fruits.add("grapes");
        fruits.add("banana");
        fruits.add("watermelon");
        fruits.add("melon");
        fruits.add("grapes"); //bunu tekrar eklemez, cunku zaten grapes eklemisti
        fruits.add(null);

        System.out.println(fruits);


        //LinkedHashSet


        System.out.println("-----LinkedHashSet-------");


        LinkedHashSet<String> cities = new LinkedHashSet();
        cities.add("istanbul");
        cities.add("ankara");
        cities.add("izmir");
        cities.add("erzurum");
        cities.add("istanbul");

        System.out.println("şehirler: " + cities);


        //TreeSet


        System.out.println("-----TreeSet-------");

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(18);
        numbers.add(2);

        System.out.println(numbers);


        TreeSet<String> cars = new TreeSet<>();
        cars.add("mercedes");
        cars.add("bmw");
        cars.add("vosvos");
        cars.add("audi");

        System.out.println(cars);

        cars.isEmpty();
        //cars.clear();
        System.out.println(cars.isEmpty());



    }
}
