public interface BinarySearchTreeADT<E> extends BinaryTreeADT<E> {
    /**
     * Adds a new element in the propoer location in this tree.
     */
    public void insert(E element);

    /**
     * Removes and returns the specified element in this tree.
     */
    public T removeElement(E element);

    /**
     * Removes and returns the smallest element in this tree.
     */
    public T removeMin();

    /**
     * Removes and returns the largest element in this tree.
     */
    public T removeMax();

    /**
     * Returns the smallest element in this tree.
     */
    public T findMin();

    /**
     * Returns the largest element in this tree.
     */
    public T findMax();
}
