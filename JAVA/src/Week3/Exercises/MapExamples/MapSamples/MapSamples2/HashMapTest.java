package Week3.Exercises.MapExamples.MapSamples.MapSamples2;
import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
    public static void main (String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Ali", 85);
        students.put("Ayşe", 90);
        students.put("Zeynep", 75);
        students.put("kerem" , 80);

        System.out.println("Students: " +students);

        System.out.println("Ayşenin notu : " + students.get("Ayşe"));

        System.out.println("Tüm öğrenciler: " + students.keySet());
        System.out.println("Tüm notlar: " + students.values());

        students.remove("kerem");
        System.out.println("Kalanlar: " + students);


    }
}
