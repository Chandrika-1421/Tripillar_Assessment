package Module13;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTMinMax {
    Node2 root;

    // Find Minimum
    int findMin(Node2 root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find Maximum
    int findMax(Node2 root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }
        while (root.right!= null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        BSTMinMax tree = new BSTMinMax();

        // Creating BST
        tree.root = new Node2(50);
        tree.root.left = new Node2(30);
        tree.root.right = new Node2(70);
        tree.root.left.left = new Node2(20);
        tree.root.left.right = new Node2(40);
        tree.root.right.left = new Node2(60);
        tree.root.right.right = new Node2(80);

        System.out.println("Minimum element: " + tree.findMin(tree.root));
        System.out.println("Maximum element: " + tree.findMax(tree.root));
    }
}

