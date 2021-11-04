
import java.util.*;

class rangeSum {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        int s=0;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            if(temp.val>=low && temp.val<=high){
                s+=temp.val;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        return s;
    }
}