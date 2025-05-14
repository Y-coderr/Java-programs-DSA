public class BinaryTreeTraversal{
   class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

    public static preOrdered(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrdered(root.left);
        preOrdered(root.right);
    }

    public static levelOrderTraversal(Node root){
        if(root == null){
            return ;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            
    }
}