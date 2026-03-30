package Module13;
class Node{
    int data;
    Node1 left;
    Node1 right;
    Node(int data){ //Constructor
        this.data=data;
        left=null;
        right=null;
    }
}

public class BST_insert {
    Node1 root = null;

    Node1 insert(Node1 root, int data) {
        if (root == null) {
            root = new Node1(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
    void Inorder(Node1 root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        BST_insert tree = new BST_insert();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("InOrder Traversal(sorted)-->");
        tree.Inorder(tree.root);
    }
}