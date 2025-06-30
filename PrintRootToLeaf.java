import java.util.ArrayList;

public class PrintRootToLeaf {
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
    
    public static void printPath(ArrayList<Integer> path){
       for(int i=0;i<path.size()-1;i++){
        System.out.print(path.get(i)+"->");
       }
       System.out.print("Null");
       System.out.println();
    }

    public static void printPathToLeaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return ;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }

        printPathToLeaf(root.left, path);
        printPathToLeaf(root.right, path);

        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
         
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right = new Node(7);
        
        printPathToLeaf(root, new ArrayList<>());

    }
}
