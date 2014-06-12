/**
 * Linked list implements a stack.
 */

public class LinkedStack<T> {
    private class ListNode<T> {
        public T value;
        public ListNode next;

        public ListNode(T value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private ListNode top = null;
    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) {
        if (top == null) {
            top = new ListNode(value);
        } else {
            ListNode node = new ListNode(value);
            node.next = top;
            top = node;
        }

        size += 1;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        return top.value;
    }

    public T pop() {
        if (size == 0) {
            throw new NoSuchElementExcpetion();
        }

        T value = top.value;
        top = top.next;
        size -= 1;

        return value;
    }
}
