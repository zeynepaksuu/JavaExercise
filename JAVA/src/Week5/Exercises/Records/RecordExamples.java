package Week5.Exercises.Records;

public class RecordExamples {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point);
        Point point1 = new Point(1,1);
        System.out.println(point1);

        System.out.println("----Rectangle Records----");

        Rectangle rectangle = new Rectangle (4,3);
        System.out.println(rectangle.area());

        var mommy = new Bird(4, "Maviş");
        System.out.println(mommy.numberEggs() + " " + mommy.name());

        var child = new Bird(0, "Sarı");
        System.out.println(child.numberEggs() + " " + child.name());

        var child1 = new Bird(0, "Kahve", "bumblebee");
        System.out.println(child1);
    }
}
