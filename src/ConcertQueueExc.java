import java.util.ArrayDeque;
import java.util.Queue;

public class ConcertQueueExc {

    // Queue fits because people join at the back and leave from the front (first in, first out).
    public static void main(String[] args) {
        Queue<String> concertQueue = new ArrayDeque<>();

        concertQueue.offer("Anna");
        concertQueue.offer("Bob");
        concertQueue.offer("Charlie");
        concertQueue.offer("Diana");
        concertQueue.offer("Eric");
        concertQueue.offer("Fatima");

        for (int i = 0; i < 2; i++) {
            System.out.println("Letting in: " + concertQueue.poll());
        }

        System.out.println("Remaining queue: " + concertQueue);
    }
}