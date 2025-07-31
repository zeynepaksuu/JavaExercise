package Week2.Exercises.Practices.Samples;

public class AnimalTest {
    public static void main ( String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound(); //bunu olusturabiliriz cunku dog bir abstract sınıf degil ama animal olusturamazdık

    }
}
