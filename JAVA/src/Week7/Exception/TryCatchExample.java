package Week7.Exception;

import java.io.IOException;

public class TryCatchExample {
    public static void main (String[] args) {

        String[] numbers = {"patika", "2"};



        try {
            //protected code blok
            System.out.println(Integer.parseInt(numbers[0]));
            method();

        }catch (IOException e) {
            //exception handler
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("parse edilirken hata oluştu");
        } finally {
            //her zaman calısır

        }


        try{

        } finally{
            System.out.println("her zaman calısır");
        }



    }

    public static void method() throws IOException {
        throw new IOException("Bir hata oluştu");

    }
}
