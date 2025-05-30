import javax.swing.tree.TreeNode;

public class DiameterOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // finding height of binary tree
    public static int height(Node root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // finding the diameter of tree
    public static int diameter(Node root){
        if (root == null) {
            return -1;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt +1;

        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right = new Node(7);


        System.out.println(height(root));
    }
    
}
