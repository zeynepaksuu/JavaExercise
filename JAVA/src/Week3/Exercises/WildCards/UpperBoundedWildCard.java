package Week3.Exercises.WildCards;
import java.util.List;


public class UpperBoundedWildCard {
    public static double plus(List<? extends Number> list) {
        double sum = 0;

        for( Number number: list) {
            sum+= number.doubleValue();
        }
        return sum;

    }


    public static void main (String[] args) {
        List<Integer> integerList = List.of(1,2,3);
        List<Double> doubleList = List.of(3.14, 2.17);

        System.out.println(plus(integerList));
        System.out.println(plus(doubleList));
        //string ekleyemiyoz

    }
}
