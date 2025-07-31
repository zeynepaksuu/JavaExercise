package Week2.Exercises.Practices.Samples;

import java.sql.SQLOutput;

public class keywordsTest {
    public static void main (String[] args) {
        Car car = new Car();
        System.out.println(car.getModel());
        System.out.println(car.getBrand());


        Car car1 = new Car("bmw");
        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());



        Car car2 = new Car( "i200", "mercedes");
        System.out.println(car2.getModel());
        System.out.println(car2.getBrand());

        Car car3 = new Car( "2012", "vosvos", 150);
        System.out.println(car3.getModel());
        System.out.println(car3.getBrand());
        System.out.println(car3.getHorsePower());



        //---
        System.out.println("-----------------------");

        Child child = new Child("message");


        // -------
        System.out.println("-----------------------");
        System.out.println("static");
        int add = MathsUtil.add(1,3);


        Car.horsePower = 170;

        System.out.println(Car.horsePower);
        System.out.println(car1.horsePower);
        System.out.println(car2.horsePower);
        System.out.println(car3.horsePower);

    }
}
