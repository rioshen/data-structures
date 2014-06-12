/**
 * A queue interface.
 */

public interface Queue<T> {
    /**
     * Add the given item to the tail of the queue.
     */
    public void enqueue(T item);

    /**
     * Remove the item at the head and return it.
     */
    public T dequeue();

    /**
     * Return the item at the head.
     */
    public T peek();

    /**
     * Return the number of items in the queue.
     */
    public int size();

    /**
     * Return whether the queue is empty.
     */
    public boolean isEmpty();
}
