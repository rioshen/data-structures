/**
 * An linked implementation of Binary Search Tree.
 */

public class BinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    private int size;
    private BinaryTreeNode<E> root;
    private Comparator<E> comparator;

    public BinarySearchTree(Comparator<E> comp) {
        comparator = comp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E target) {
        BinaryTreeNode<E> current = root;

        while (current != null) {
            int result = comare(current.value, target);

            if (result == 0) {
                return true;
            } else if (result > 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public void insert(E element) {
        if (root == null) {
            root = new BinaryTreeNode(element);
            return;
        }

        BinaryTreeNode<E> current = root;
        while (current != null) {
            int result = compare(current.value, element);

            if (result == 0) {
                return;
            } else if (result > 0) {
                if (current.left == null) {
                    current.left = new BinaryTreeNode(element);
                    return;
                } else {
                     current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new BinaryTreeNode(element);
                    return;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public void inorder() {
        if (!isEmpty()) {

        }
    }

    private int compare(E x, E y) {
        return comparator == null ? x.compareTo(y) : comparator.compareTo(x, y);
    }
}
