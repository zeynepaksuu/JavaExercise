package Week3.Homeworks.Generics;

public class ArrayMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
