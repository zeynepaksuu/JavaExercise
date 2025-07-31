package Week2.Exercises.Practices.OOP.Inheritance.Example1;

//bir modelleme yapılırken generic durumları en üst class yapabiliriz. bu durumda ÜRÜN üst class olmalıdır

public class Product { // extends Object -> siz eklemeseniz de böyledir
    private String name;
    private double price;


    //default constructor hep olur ama yeni constructor olusturursak default olan ezilir.
    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
