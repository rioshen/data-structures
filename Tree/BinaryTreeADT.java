/**
 * An implementation of Binary Tree interface.
 */
public interface BinaryTreeADT<E> {
    /**
     * Returns a reference to the root of the binary tree.
     */
    public BinaryTreeNode getRoot();

    /**
     * Returns true is the tree is empty, otherwise returns false.
     */
    public boolean isEmpty();

    /**
     * Returns the number of nodes in this binary tree.
     */
    public int size();


    /**
     * Returns true is the target is found, otherwise returns false.
     */
    public boolean contains(E target);

    /**
     * Performs an inorder traversal on the binary tree, iterative indorder method.
     */
    public void inorder();

    /**
     * Performs an preorder traversal on the binary tree.
     */
    public void preorder();

    /**
     * Performs a postorder traversal on this binary tree.
     */
    public void postorder();

    /**
     * Performs a level order traversal on this binary tree.
     */
    public void levelorder();
}
