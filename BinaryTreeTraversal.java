public class BinaryTreeTraversal{
   class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

    public static Node preOrdered(Node root){
        if(root == null){
            return null;
        }
        System.out.print(root.data + " ");
        preOrdered(root.left);
        preOrdered(root.right);
    }

    public static Node levelOrderTraversal(Node root){
        if(root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            
    }
}