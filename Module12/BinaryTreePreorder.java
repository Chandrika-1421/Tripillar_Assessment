package Module12;
class Node1{
    int data;
    Node4 left;
    Node4 right;
    Node1(int data){ //Constructor
        this.data=data;
        left=null;
        right=null;
    }
}


public class BinaryTreePreorder {
    Node4 root;//instance variable-->called inside a class
    void preorder (Node4 root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        BinaryTreePreorder tree = new BinaryTreePreorder();
        //Manual creation of tree structure
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        tree.root.right.left = new Node4(6);
        tree.root.right.right = new Node4(7);

        System.out.println("PreOrder Traversal-->");
        tree.preorder(tree.root);
        System.out.println();

    }
}


