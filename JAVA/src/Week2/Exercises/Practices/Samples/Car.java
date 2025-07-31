package Week2.Exercises.Practices.Samples;

public class Car {
    private String brand;
    private String model;
    public static int horsePower = 150;

    public Car() {
         } //bu default olarak olusur olması gerekiyor



    public Car(String model,String brand) {
        this.brand = brand; //ikinci kullanım parametre kullanımı
        this.model = model;

    }

    public Car(String model,String brand, int horsePower) {
        this.brand = brand; //ikinci kullanım parametre kullanımı
        this.model = model;
        this.horsePower = horsePower;

    }

    public Car(String brand) {
        this.brand = brand; //overload yapıyoruz
    }


    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getHorsePower() {
        return horsePower;
    }
}
