package Module12;
class Node2 {
    int data;
    Node4 left;
    Node4 right;
    Node2(int data){ //Constructor
        this.data=data;
        left=null;
        right=null;
    }
}


public class BinaryTreePostorder {
    Node4 root;//instance variable-->called inside a class
    void postorder (Node4 root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {
        BinaryTreePostorder tree = new BinaryTreePostorder();
        //Manual creation of tree structure
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        tree.root.right.left = new Node4(6);
        tree.root.right.right = new Node4(7);

        System.out.println("PostOrder Traversal-->");
        tree.postorder(tree.root);
        System.out.println();

    }
}

