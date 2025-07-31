package Week2.Exercises;

public class CarTest {
    public static void main (String[] args) {

        Car bmw  = new Car(); // nesne olusturduk //instance
        bmw.setBrand("bmw");
        bmw.setModel("3.20");
        bmw.setMaxSpeed(280);
        bmw.setHorsePower(180);

        bmw.move();
        bmw.incrementGear(2);
        int gear = bmw.getGear();
        System.out.println(gear);
    }
}
