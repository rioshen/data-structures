public class BinarySearchTree<E> {
    private class BinaryNode {
        private E value;
        private BinaryNode left;
        private BinaryNode right;

        public BinaryNode(E value) {
            this.value = value;
            left = right = null;
        }

        public BinaryNode(E value, BinaryNode left, BinaryNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Root node of the binary search tree.
     */
    private BinaryNode root;
}
