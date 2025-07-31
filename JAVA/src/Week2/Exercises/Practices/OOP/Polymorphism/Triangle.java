package Week2.Exercises.Practices.OOP.Polymorphism;

public class Triangle extends Shape {
    private double base;
    private double high;

    public Triangle(double high, double base) {
        this.high = high;
        this.base = base;
    }

    @Override
    double calculateArea() {
        return (high * base)/2;
    }
}
