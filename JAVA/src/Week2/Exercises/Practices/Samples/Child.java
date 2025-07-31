package Week2.Exercises.Practices.Samples;

public class Child extends Parents {
    private String message = "message from child";



    public Child(String message) {
        super(message); // bir üst classın constructorını ifade eder
        System.out.println(super.getMessage());// parent classındaki getmessage methoduna yönlendirir
        System.out.println(this.getMessage());
    }

    @Override
    public String getMessage() {
        return message;
    }
}
