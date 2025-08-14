package Week5.Homeworks.Records;

public class StudentsMain {
    public static void main(String[] args) {

                Student s1 = new Student("Zeynep", "Aksu", 1001);
                Student s2 = new Student("Ahmet", "Yılmaz", 1002);
                Student s3 = new Student("Zeynep", "Aksu", 1001);

             //toString oto geliyo
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);

                // equals() ve hashCode() kontrolü
                System.out.println("s1 equals s3? " + s1.equals(s3)); // true
                System.out.println("s1 hashCode == s3 hashCode? " + (s1.hashCode() == s3.hashCode())); // true
    }
}
