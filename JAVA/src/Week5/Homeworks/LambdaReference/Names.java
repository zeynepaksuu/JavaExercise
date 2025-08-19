package Week5.Homeworks.LambdaReference;
import java.util.Arrays;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep"); //listeyi lambda kullanarak bu sekilde yazabiliriz
        names.forEach(System.out::println); //foreach döngüsü kullanarak böyle çağırabiliriz
    }
}
