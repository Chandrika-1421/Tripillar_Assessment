package Module13;

class Node4 {
    int data;
    Node4 left, right;

    Node4(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Valid_BST {
    Node4 root;
    boolean isBST(Node4 root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean validate(Node4 root, long min, long max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return validate(root.left, min, root.data) &&
                validate(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Valid_BST tree = new Valid_BST();

        // Valid BST
        tree.root = new Node4(50);
        tree.root.left = new Node4(100);//o/p-->false
        tree.root.right = new Node4(70);
        tree.root.left.left = new Node4(20);
        tree.root.left.right = new Node4(40);

        System.out.println("Is valid BST? " + tree.isBST(tree.root));
    }
}

