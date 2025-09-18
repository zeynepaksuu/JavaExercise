package Week7.Exception;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class ExceptionExample {
    public static void main (String[] args) throws FileNotFoundException {
        int[] Numbers = {1,2,3};
        // System.out.println(Numbers[5]); //ArrayIndexOutOfBoundException   unchecked exception, runtime zamanında hata alırız
        // Scanner scanner = new Scanner(new File("test")); //FileNotFoundException  checked exceptiondur ve daha yazarken hata alırız (compile), throws edilebilir

        try {
            readfile();
            //todo yeni şeyler yapılabilir
            //todo dosyayı farklı bir yere kaydedebiliriz
        }catch(FileNotFoundException e){
            //throw new RuntimeException(e);
            System.out.println("Dosya bulunamadı");
        }

    }

    private static void readfile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test"));
    }
}
