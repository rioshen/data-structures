/**
 * Linked list implements a stack.
 */

import java.util.NoSuchElementException;

public class LinkedStack<T> {
    private class ListNode {
        T value;
        ListNode next;

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
        top = new ListNode(value, top);
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
            throw new NoSuchElementException();
        }

        T value = top.value;
        top = top.next;
        size -= 1;

        return value;
    }

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
