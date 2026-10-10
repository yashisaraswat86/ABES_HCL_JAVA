package Collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeImplementation {
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        q.poll(); //q.remove() gives exception for empty queue
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q);
        q.poll();
        q.offer(1);
        System.out.println(q.isEmpty());
        System.out.println(q);

    }
}
