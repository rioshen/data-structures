import java.util.LinkedList;

/**
 * A stack class implementaed as a wrapper around LinkedList
 * All stack methods simply delegate to LinkedList methods.
 */

public class WrapperStack<E> {
    private LinkedList<E> items = new LinkedList<E>();

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return items.size();
    }

    /**
     * Return true if the stack is not empty otherwise return false.
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Append a new element at the end.
     */
    public void push(E item) {
        items.addFirst(item);
    }

    /**
     * Return the first element in the stack and remove it.
     */
    public E pop() {
        return items.removeFirst();
    }

    /**
     * Return the first element from the stack.
     */
    public E peek() {
        return items.getFirst();
    }

    public static void main(String[] args) {
        WrapperStack<String> stack = new WrapperStack<String>();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push("a");
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    } 
}
