package Module13;
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

public class BST_delete {
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

    Node3 delete(Node3 root, int data) {
        if (root == null) return null;
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            //Case1-->NO child
            if (root.left == null && root.right == null) {
                return null;
            }
            //Case2-->ONE child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //Case3-->TWO child
            else {
                Node3 successor = findMin(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }

    Node3 findMin(Node3 root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    void Inorder(Node3 root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        BST_delete tree = new BST_delete();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("InOrder Traversal(sorted)-->");
        tree.Inorder(tree.root);

        System.out.println();
        tree.root = tree.delete(tree.root, 40);
        tree.Inorder(tree.root);
    }
}

