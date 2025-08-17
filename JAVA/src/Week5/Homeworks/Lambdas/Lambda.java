package Week5.Homeworks.Lambdas;
import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        numbers.replaceAll(n -> n*2); //replace all methodunu kullanınca her bir n degerine bu işlemi uygulayıp yerine yazıyormus
        numbers.forEach(n -> System.out.println(n)); //ekrana böyle yazdırıyoruz

    }


}
