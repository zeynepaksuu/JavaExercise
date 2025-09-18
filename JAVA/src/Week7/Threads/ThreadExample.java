package Week7.Threads;

public class ThreadExample {
    public static void main (String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        MyThread myThread3 = new MyThread();
        myThread3.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();




    }

}
