/**
 * An implementation of Queue, built as a wrapper class around the LinkedList
 * class from java.util package.
 */

import java.util.LinkedList;

public class WrapperQueue<T> implements Queue<T> {
    private LinkedList<T> items = new LinkedList<T>();

    public void enqueue(T item) { items.addLast(item); }

    public T dequeue() { return items.removeFirst(); }

    public T peek() { return items.getFirst(); }

    public int size() { return items.size(); }

    public boolean isEmpty() { return items.isEmpty(); }


    public static void main(String[] args) {
        WrapperQueue<Integer> queue = new WrapperQueue<Integer>();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
