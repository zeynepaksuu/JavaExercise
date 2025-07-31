package Week2.Exercises.Practices.Samples;

public class Cat extends Animal {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void makeSound() {
        System.out.println("miyav miyav miyav");
    }
}
