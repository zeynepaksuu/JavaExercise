package Week5.Exercises.MethodReference;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class MethodReferenceExample {
    public static void main(String[] args) {

        // 1:: static void reference -> ClassName:: MethodName
        BiFunction<Integer, Integer, Integer> sum = MathOperations::sum;
        System.out.println("Toplam =  " +sum.apply(5,7));


        // 2:: Instance method -> objectReference::instancemethod
        Printer printer = new Printer();
        Consumer<String> stringConsumer = printer::print;
        stringConsumer.accept("merhaba");


        // 3:: Instance method referance( sınıf üzerinden) -> ClassName::MethodName
        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Fatma", "Batuhan");
        names.forEach(System.out::println);
        // 4:: Constructor method referance -> ClassNmae::new
        Supplier<Car> carSupplier = Car::new;
        carSupplier.get();
    }
}
