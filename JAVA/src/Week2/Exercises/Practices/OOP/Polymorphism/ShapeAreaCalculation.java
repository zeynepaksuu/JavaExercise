package Week2.Exercises.Practices.OOP.Polymorphism;
import java.util.Scanner;

public class ShapeAreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Hangi şeklin alanını hesaplamak istersiniz? : Üçgen = 1  / Kare = 2 / Daire = 3 ");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("üçgenin tabanını giriniz: ");
                double base = scanner.nextDouble();
                System.out.println("üçgenin yüksekliğini giriniz: ");
                double high = scanner.nextDouble();
                shape = new Triangle(high, base);
                break;

            case 2:
                System.out.println("karenin bir kenarını giriniz: ");
                int side = scanner.nextInt();
                shape = new Square(side);
                break;

            case 3:
                System.out.println("dairenin yarıçapını giriniz: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            default:
                System.out.println("geçerli bir değer giriniz.");


        }

        double result = shape.calculateArea();
        System.out.println(result);

    }
}
