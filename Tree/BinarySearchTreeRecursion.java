/**
 * An recursive implementation of binary search tree.
 */

public class BinarySearchTreeRecursion<E> {
    private BinaryTreeNode<E> root;

    public BinarySearchTreeRecursion(BinaryTreeNode root) {
        this.root = root;
    }

    public int getHeight() {
        return height(root);
    }

    private int height(BinaryTreeNode node) {
        if (node == null) {
            return -1;
        }

        int left = height(node.left);
        if (left == -1) return -1;

        int right = height(node.right);
        if (right == -1) return -1;

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearchTreeRecursion<Integer> tree = new BinarySearchTreeRecursion<Integer>(TreeUtil.buildBST(array));
        System.out.println(tree.getHeight());
    }
}
