import java.util.NoSuchElementException;

/**
 * An implementation of queue using linked list.
 */

public class LinkedQueue<T> implements Queue<T> {
    private class ListNode {
        public T value;
        public ListNode next;

        public ListNode(T value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private int size;
    private ListNode head;
    private ListNode tail;

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public void enqueue(T item) {
        ListNode node = new ListNode(item, null);

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }

        tail = node;
        size++;
    }

    public T dequeue() {
        T value = head.value;

        if (head == tail) {
            tail = null;
        }

        head = head.next;
        size--;

        return value;
    }

    public T peek() { return head.value; }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
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
