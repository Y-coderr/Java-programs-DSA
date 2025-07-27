import java.util.ArrayList;

import org.w3c.dom.Node;


public class BstToBalancedBST {
        class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     public void inOrder(TreeNode root,ArrayList<Integer>inorder){
        if(root==null){
            return ;
        }

        inOrder(root.left,inorder);
        inorder.add(root.data);
        inOrder(root.right,inorder); 
    }
    public TreeNode createBST(ArrayList<Integer>inorder, int st , int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left= createBST(inorder,st,mid-1);
        root.right = createBST(inorder,mid+1,end);

        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
         // inorder sequence 
         ArrayList<Integer> inorder = new ArrayList<>();
         inOrder(root,inorder);

         // balanced sequence 
        root = createBST(inorder , 0 , inorder.size()-1);

        return root;
    }
    public void main(String[] args) {
        TreeNode root = new TreeNode (8);
        root.left = new TreeNode(6) ;
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(3);
        root.right = new TreeNode (10);
        root.right.right = new TreeNode(11);
        root.right.right. right = new TreeNode(12);

        Node roott = balanceBST(root); 
    }
}
