public class LowestCommonAncesstorBT {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
           this.data = data;
           this.left=null;
           this.right=null;
        }
     }    

     public static Node lca(Node root, int n1,int n2){
        if(root.data == n1 || root.data == n2){
            return null;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if(leftLca == null){
            return rightLca;
        }

        if(rightLca == null){
            return leftLca;
        }

        return root;

     }

     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right = new Node(7);

        System.out.println(lca(root, 4, 5));
     }
}
