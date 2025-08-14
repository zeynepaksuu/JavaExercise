package Week5.Exercises.Enums;

public class EnumTest {
    public static void main (String[] args) {

        for(Days day: Days.values() ) {
            System.out.println(day);
        }

        System.out.println(Direction.East.name() + " " + Direction.West.getAngle());

        System.out.println("operations");
        System.out.println(Operation.ADD.apply(5,7));
        System.out.println(Operation.SUBTRACT.apply(10,7));
    }
}
