package Week2.Exercises;

public class Car {
    //field yani özellikler

    private String brand ;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private int maxGearCount = 6;
    private int gear = 0;


    public void move() {
        System.out.println("hareket et");

    }
    public void incrementGear(int gearCount){
        if(maxGearCount >= gearCount) {
            this.gear = gearCount;
        } else{
            System.out.println("this is not max gear count.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
