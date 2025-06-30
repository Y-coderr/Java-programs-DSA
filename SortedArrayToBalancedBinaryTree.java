public class SortedArrayToBalancedBinaryTree {

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

    public static Node createBst(int arr[],int start , int end ){
        if(start > end) {
            return null;
        }

        int mid = start + end /2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr, start, mid-1);
        root.right = createBst(arr, mid+1, end);

        return root;
    }
     public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int [] arr ={3,6,5,8,10,11,12};

        Node root = createBst(arr, 0, arr.length-1);

        preOrder(root);
    }
    
}
