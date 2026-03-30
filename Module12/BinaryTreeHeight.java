package Module12;
class Node3 {
    int data;
    Node3 left;
    Node3 right;
    Node3(int data){ //Constructor
        this.data=data;
        left=null;
        right=null;
    }
}

public class BinaryTreeHeight {
    Node3 root = null;

    Node3 insert(Node3 root, int data) {
        if (root == null) {
            root = new Node3(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    int height(Node3 root) {  //Longest path from root-->leaf
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        BinaryTreeHeight tree = new BinaryTreeHeight();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);


        System.out.println();
        System.out.println("height of the tree:" + tree.height(tree.root));
    }
}

