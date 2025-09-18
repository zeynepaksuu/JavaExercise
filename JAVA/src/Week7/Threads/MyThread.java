package Week7.Threads;

public class MyThread  extends Thread {

    @Override
    public void run() {
        System.out.println("Thread calısıyor: " +Thread.currentThread());
    }
}
