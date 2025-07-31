package Week2.Exercises.Practices.OOP.Inheritance.Example1;

public class Electronic extends Product {

    private int warrantyPeriod;


    public Electronic (String name, double price) {
       super(name, price);
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
