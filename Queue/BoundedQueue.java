import java.util.NoSuchElementException;


/**
 * An implementation of queue, using a fixed, circular aray whose capacity
 * is set in its constructor.
 */

public class BoundedQueue<T> implements Queue<T> {
    private T[] items;
    private int size;
    private int head;
    private int tail;

    public BoundedQueue(int capacity) {
        items = (T []) new Object[capacity];
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public void enqueue(T item) {
        if (size == items.length) {
            throw new IllegalStateException("Cannot add item to full queue.");
        }

        items[tail] = item;
        tail = (tail + 1) % items.length;
        size ++;
    }

    public T dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot remove item from emtpy queue.");
        }

        T value = items[head];
        items[head] = null;
        head = (head + 1) % items.length;
        size --;

        return value;
    }

    public T peek() {
        return items[size - 1];
    }

    public static void main(String[] args) {
        BoundedQueue<Integer> queue = new BoundedQueue<Integer>(20);
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
