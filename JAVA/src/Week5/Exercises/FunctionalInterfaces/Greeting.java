package Week5.Exercises.FunctionalInterfaces;

@FunctionalInterface
public interface Greeting {


    void sayHello(); // bodysi olmicak abstract method


     // void sayMerhaba();  // functional Interface olarak tanımladıgımız icin ikinci bir abstract method tanımlayamıyoruz

    default void sayMerhaba() {
        System.out.println("functional interface default method");
    }
}
