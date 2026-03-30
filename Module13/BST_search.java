package Module13;
class Node1 {
    int data;
    Node1 left;
    Node1 right;
    Node1(int data){ //Constructor
        this.data=data;
        left=null;
        right=null;
    }
}

public class BST_search {
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
    boolean search(Node1 root, int data){
        if(root==null)return false;
        if(root.data==data)return true;
        if(data<root.data){
            return search(root.left,data);
        }
        else
            return search(root.right,data);
    }

    public static void main(String[] args) {
        BST_search tree = new BST_search();
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
        System.out.println("Search 60:"+tree.search(tree.root,60));

        System.out.println();
        System.out.println("Search 100:"+tree.search(tree.root,100));

    }
}

