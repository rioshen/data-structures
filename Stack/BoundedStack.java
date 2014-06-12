import java.util.NoSuchElementExcpetion;

/**
 * An implementation of a stack using fixed, non-expandable array.
 */

public class BoundedStack<T> {
    private int size;
    private E[] items;

    public BoundedStack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }

        items = (T []) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T item) {
        if (size == items.length) {
            throw new IllegalStateException("Cannot add to full stack.");
        }
        items[size++] = item;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek from empty stack.");
        }

        return items[size - 1];
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot pop from empty stack.");
        }

        T item = items[size - 1];
        items[--size] = null;
        return item;
    }

    public static void main(String[] args) {

    }

}
