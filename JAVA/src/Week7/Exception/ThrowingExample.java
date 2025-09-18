package Week7.Exception;

import java.io.FileNotFoundException;

public class ThrowingExample {
    public static void main (String[] args) throws Exception {
        //throw new Exception();
        //throw new Exception("Bir hata oluştu"); //does not compile -- unreachable , zaten kod hiçbir zaman bu satıra ulaşmıyor
        //throw RuntimeException(); //new keywordu olmadıgından dolayı compile olmaz
        //method(); // doesnt compile, cunku bu method hala bir hata fırlatıyor o yüzden try catche yazmalıyız

        try{
            throw new FileNotFoundException("Dosya bulunamadı");

        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }


    }

    private static void method() throws FileNotFoundException{
        throw new FileNotFoundException("Dosya bulunamadı");
    }
}
