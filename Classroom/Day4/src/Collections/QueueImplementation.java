package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.poll(); //q.remove() gives exception for empty queue
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q);
        q.poll();
        q.offer(1);
        System.out.println(q);
        System.out.println(((LinkedList<Integer>) q).getLast());

    }

}
