public class DeleteNodeBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right = delete(root.right,val);
        }
        else if(root.data > val){
            root.left = delete(root.left,val);
        }
        else{
            if(root.left==null  &&  root.right == null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);

        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
