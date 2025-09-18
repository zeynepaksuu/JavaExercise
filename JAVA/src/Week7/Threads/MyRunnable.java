package Week7.Threads;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread calısıyor: " +Thread.currentThread());
    }
}
