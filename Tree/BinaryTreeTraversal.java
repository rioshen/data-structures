import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class BinaryTreeTraversal {
    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.value + " ");
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (true) {

        }
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                System.out.print(node.value + " ");
                node = node.right;
            }
        }
    }

    public static void main(String[] args) {
        /**
         *    10
         *  /   \
         * 8      2
         * /\    /
         *3  5  2
         */
        TreeNode root = new TreeNode(10);
        root.left        = new TreeNode(8);
        root.right       = new TreeNode(2);
        root.left.left  = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }
}
