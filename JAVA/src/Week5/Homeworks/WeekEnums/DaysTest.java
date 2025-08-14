package Week5.Homeworks.WeekEnums;
import java.util.Scanner;



public class DaysTest {


    public static void main (String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a day, please enter in english! : ");
        String input = scanner.nextLine().toUpperCase(); //hangi günü seçtiği büyük kücük harf ile yazmasına baglı olarak düzeltilmeli

//        for(Day day: Day.values() ) {
//            System.out.println(day);
//        }

        for (Day day : Day.values()) {
            if (day.name().equals(input)) {// girilen input değeri gün adıyla eşleşiyorsa diye bakıyoruz
                System.out.println("Working hours for " + day + ": " + day.getHours());
                return;
            }
        }

        //eğer random sacma sapan bir input girdiyse bunu döndürüyoruz
        System.out.println("Invalid day name!");
    }

}
