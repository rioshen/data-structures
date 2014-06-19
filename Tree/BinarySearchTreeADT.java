public interface BinarySearchTreeADT<E> extends BinaryTreeADT<E> {
    /**
     * Adds a new element in the propoer location in this tree.
     */
    public void insert(E element);

    /**
     * Removes and returns the specified element in this tree.
     */
    public E removeElement(E element);

    /**
     * Removes and returns the smallest element in this tree.
     */
    public E removeMin();

    /**
     * Removes and returns the largest element in this tree.
     */
    public E removeMax();

    /**
     * Returns the smallest element in this tree.
     */
    public E findMin();

    /**
     * Returns the largest element in this tree.
     */
    public E findMax();
}
