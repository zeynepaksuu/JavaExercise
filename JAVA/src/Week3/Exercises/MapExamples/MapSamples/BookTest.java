package Week3.Exercises.MapExamples.MapSamples;
import java.util.HashMap;
import java.util.Map;

//kitabın arkasındaki barkodu tarattıgımızda kitabın bilgilerini bize getirsin

public class BookTest {
    public static void main (String[] args) {

        Map<String, Book> bookmap = new HashMap<>();
        bookmap.put("ISBN123", new Book("Clean Code", "Robert C. Martin"));
        bookmap.put("ISBN345", new Book("Ateşten Gömlek", "Halide Edip Adıvar"));

        for (Map.Entry<String, Book>entry:bookmap.entrySet()){
            System.out.println("Key: " + entry.getKey() + "value : " + entry.getValue());

        }


    }
}
