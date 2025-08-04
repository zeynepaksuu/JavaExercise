package Week3.Exercises.WildCards;
import java.util.ArrayList;
import java.util.List;


public class LowerBoundedWildCard {
    public static void add(List<? super Integer> list) {
        list.add(1);
        list.add(4);
    }
    public static void main (String[] args) {
        List<Number> numbers = new ArrayList<>();
        add(numbers);

        System.out.println(numbers);

//        List<Double> doublenumbers = new ArrayList<>();
//        add(doublenumbers);
//
//        System.out.println(doublenumbers);

        //yapamayız cunku sadece ıntegerı üst class olarak alan sınıfları bu sekilde kullanabiliyoruz super keywordunu kullandıgımız icin


    }
}
