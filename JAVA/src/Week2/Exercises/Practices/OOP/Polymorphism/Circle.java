package Week2.Exercises.Practices.OOP.Polymorphism;

public class Circle extends Shape{

    private double PI = 3.14;
    private double radius ;

    public Circle(double PI) {
        this.PI = PI;
    }

    @Override
    double calculateArea() {
        return PI * (radius * radius);
    }
}
