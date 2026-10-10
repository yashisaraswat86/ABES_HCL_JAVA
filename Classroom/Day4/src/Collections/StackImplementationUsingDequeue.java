package Collections;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Queue;

public class StackImplementationUsingDequeue {
    public static void main(String[] args){
        ArrayDeque<Integer> stack = new ArrayDeque<>();//It gives you the method of stack
       stack.poll(); //q.remove() gives exception for empty queue
        stack.offer(1);//push at the end
        stack.offer(2);
        stack.offer(3);
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.poll();
        stack.offer(1);
        System.out.println(stack.isEmpty());
        stack.push(5);//push at the front
        stack.push(7);
        stack.offer(8);
        stack.poll();//deletion from front and only
        System.out.println(stack);

    }
}
