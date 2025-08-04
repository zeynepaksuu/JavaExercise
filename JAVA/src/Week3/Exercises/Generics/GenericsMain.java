package Week3.Exercises.Generics;

public class GenericsMain {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.setContent(true);

        Box<Animal> animalBox = new Box<>();
        Animal animal = new Animal();
        animalBox.setContent(animal);


        //--------------------------


        String array[] = {"Java", "Python", "C++"};
        GenericMethodExample.printArray(array);

        Integer array2[] = {1,2,3,4};
        GenericMethodExample.printArray(array2);

        int array3[] = { 1,2,3,4,5};
        // yapamayız : : : : GenericMethodExample.printArray(array3); compile time error yeriz cunku primitive tipler




        //------------------------------


        BoundedGenericExample<Animal>  animalBoundedGenericExample = new BoundedGenericExample<Animal>();
        animalBoundedGenericExample.setContent(new Animal());

    }
}
