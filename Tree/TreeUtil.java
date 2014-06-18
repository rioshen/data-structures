public class TreeUtil {
    /**
     * Build a binary search tree based on a sorted array.
     */
    public static BinaryTreeNode<Integer> buildBST(int[] array) {
        return buildBSTHelper(array, 0, array.length - 1);
    }

    private static BinaryTreeNode<Integer> buildBSTHelper(int[] array, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        int midVal = array[mid];

        BinaryTreeNode root = new BinaryTreeNode(midVal);
        root.left = buildBSTHelper(array, low, mid - 1);
        root.right = buildBSTHelper(array, mid + 1, high);

        return root;
    }

    public static void printTree(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTreeNode<Integer> root = buildBST(array);
        printTree(root);
    }
}
