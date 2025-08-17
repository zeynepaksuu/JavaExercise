package Week5.Exercises.Lambdas;

public class LambdasExample3 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable calısıyor");
            }
        };
        new Thread(runnable).start();

        Runnable runnable1 = () -> System.out.println("lambdas runnable calsııyor");
        new Thread((runnable1)).start();

    }
}
