import java.util.HashMap;

public class TopViewOfBinaryTree {

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

    public class Info{
        Info()
    }

    public static void topView(Node root){
        Queue<Info> q = new HashMap<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0 , max =0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            if(map.containsKey(curr)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left)
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right = new Node(7);
    }
    
}
