package Week3.Exercises.MapExamples.MapSamples.MapSamples2;
import java.util.Map;
import java.util.LinkedHashMap;


public class LinkedHashMapTest {
    public static void main(String[] args) {

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("TR", "Türkiye");
        countries.put("US", "United States");
        countries.put("DE", "Germany");


        System.out.println("Countries: " +countries);

        countries.remove("DE");
        countries.put("FR", "Fransa");

        System.out.println("Countries new: " +countries);



    }
}
