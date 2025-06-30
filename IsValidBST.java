public class IsValidBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isValidBst(Node root, Node min , Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data ){
            return false;
        }

        if(max != null && root.data >= max.data){
            return false;
        }
 
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right = new Node(7);

        System.out.println(isValidBst(root, null, null));

    }
    
}
