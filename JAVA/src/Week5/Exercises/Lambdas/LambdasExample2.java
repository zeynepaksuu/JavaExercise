package Week5.Exercises.Lambdas;
import java.util.ArrayList;
import java.util.List;

public class LambdasExample2 {
    public static void main(String[] args) {

        var animals = new ArrayList<Zoo>();
        animals.add(new Zoo("fish", false, true));
        animals.add(new Zoo("cat", true, true));
        animals.add(new Zoo("kangoroo", true, false));
        animals.add(new Zoo("turtle", false, true));

        //print(animals, new CheckifHopper());
        //print(animals, new CheckifSwim());


        //lambdas
        print(animals, a -> a.canHop());

        print(animals, a -> !a.canHop()); //değilini de yazdırabiliyoruz böyle


        print(animals, a -> {
            System.out.println("lambda ifadeleri");
            return !a.canHop();
        });

    }

    private static void print(List<Zoo> zooList, CheckTrait checker) {
        for (Zoo zoo: zooList){
            if (checker.test(zoo)){
                System.out.println(zoo + " ");
            }
        }


    }
}
