package Module12;
class Node4 {
    int data;
    Node4 left;
    Node4 right;
    Node4(int data){ //Constructor
        this.data=data;
        left=null;
        right=null;
    }
}
public class BinaryTreeCount {
    Node4 root;

    int countNodes(Node4 root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);//Binary Recursion-->calling fn twice
    }

    int countLeafNodes(Node4 root) {
        if(root==null)return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeCount tree = new BinaryTreeCount();
        //Manual creation of tree structure
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        tree.root.right.left = new Node4(6);
        tree.root.right.right = new Node4(7);
        System.out.println();
        System.out.println("Total no of Nodes:" + tree.countNodes(tree.root));

        System.out.println();
        System.out.println("Total Leaf Nodes:" + tree.countLeafNodes(tree.root));
    }
}

