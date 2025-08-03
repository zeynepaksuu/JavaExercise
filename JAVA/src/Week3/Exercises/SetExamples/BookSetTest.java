package Week3.Exercises.SetExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookSetTest {
    public static void main (String[] args) {
        Set<Book> bookSet = new HashSet<>();

        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Effective Java" , "Jashua Loa");
        Book book3 = new Book("Effective Java" , "Jashua Loa");


        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        System.out.println(book2.hashCode());

        System.out.println("kütüphanem : " +bookSet);

// TREE SET


        System.out.println("-------TreeSet------");


        Set<Book> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);

        System.out.println("Kütüphanem= " +bookTreeSet);















    }
}
