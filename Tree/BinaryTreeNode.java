/**
 * An implementation of binary tree node, a node in binary tree with a left
 * child and a right child.
 */
public class BinaryTreeNode<E> {
    protected E value;
    protected BinaryTreeNode left, right;

    public BinaryTreeNode(E value) {
        this.value = value;
        this.left = this.right = null;
    }
}
