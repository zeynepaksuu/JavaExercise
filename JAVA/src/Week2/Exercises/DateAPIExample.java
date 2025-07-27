package Week2.Exercises;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAPIExample {
    public static void main ( String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println(today.format(dateTimeFormatter));

        System.out.println(today.format(dateTimeFormatter.ofPattern("dd/MM/yyyy"))); //  m = minute

        String date = "25/10/2026";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        CharSequence stringDate = null;
        DateTimeFormatter formatter = null;
        LocalDate localDate = LocalDate.parse(stringDate, formatter);
        System.out.println("ileri tarih: " +localDate);
    }
}
// this file can not be abled compile, it will be update