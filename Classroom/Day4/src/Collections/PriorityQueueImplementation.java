package Collections;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(10);

        System.out.println(pq);

        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        System.out.println(pq.contains(20));

        System.out.println(pq.peek());

        System.out.println(pq.poll());
        System.out.println(pq);

        pq.offer(5);
        System.out.println(pq);

        System.out.println(pq.isEmpty());
    }
}

