package Module12;
class Node{
    int data;
    Node3 left;
    Node3 right;
    Node(int data){ //Constructor
        this.data=data;
        left=null;
        right=null;
    }
}

public class BinaryTreeInorder {
    Node3 root;//instance variable-->called inside a class

    void inorder(Node3 root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeInorder tree = new BinaryTreeInorder();
        //Manual creation of tree structure
        tree.root = new Node3(1);
        tree.root.left = new Node3(2);
        tree.root.right = new Node3(3);
        tree.root.left.left = new Node3(4);
        tree.root.left.right = new Node3(5);
        tree.root.right.left = new Node3(6);
        tree.root.right.right = new Node3(7);


        System.out.println("Inorder Traversal-->");
        tree.inorder(tree.root);
        System.out.println();
    }
}

