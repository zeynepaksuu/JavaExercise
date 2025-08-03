package Week3.Exercises;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main (String[] args) {
        Queue<String> breadQueue = new PriorityQueue<>();
        breadQueue.add("ismet");
        breadQueue.add("mehmet");
        breadQueue.add("zeynep");
        breadQueue.add("melek");

        System.out.println(breadQueue);

        breadQueue.remove("zeynep");

        System.out.println(breadQueue);
    }
}
