package Week3.Homeworks.MapEntryWriter;
import java.util.HashMap;
import java.util.Map;

public class MapEntry {
    public static void main(String [] args) {

        Map<String,Integer> students = new HashMap<>();

        students.put("Ali", 85);
        students.put("Ayşe", 92);
        students.put("Mehmet", 78);
        students.put("Zeynep", 90);



        //sıralı yazdırmak icin for each döngüsü kullancaz
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //System.out.println("öğrenciler: " +students);
    }
}
