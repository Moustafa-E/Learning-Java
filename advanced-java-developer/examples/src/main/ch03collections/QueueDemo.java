package main.ch03collections;

import java.util.ArrayDeque;
import java.util.Deque;


public class QueueDemo {
// Queues and Stacks note: Java programs are executed in a stack. Main method is bottom of the stack.
    public static void main(String[] args) {
        
        Deque<Integer> queue = new ArrayDeque<>(); // Both stack and queue, confusingly. Contains methods for both (push() vs addFirst())
        // adds to the back - exception if failed
        queue.add(10);
        // adds to the back - returns false if failed
        queue.offer(20);
        // display the front element
        System.out.println(queue.peek());
        // get and remove front element. Null if empty. Remove() gives exception if failed.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        
        queue.add(30);
        queue.addFirst(20);
        queue.addLast(50);
        queue.push(10); // same as addFirst()

    }

}
