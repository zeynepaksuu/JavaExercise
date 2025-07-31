package Week2.Exercises.Practices.OOP.Inheritance.Example1;

public class Book extends Product {
    private String author;


    public Book (String name) {
        super(name);
    }

    public Book(String name, double price) {
        super(name, price);
    }
 }

