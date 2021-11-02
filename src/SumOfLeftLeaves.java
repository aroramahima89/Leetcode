import java.util.*;
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

class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        int s=0;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root!=null){
            q.add(root);
        }
        return sum(q,s);
    }
    public int sum(Queue<TreeNode> q,int s){
        if(q.isEmpty()){
            return s;
        }
        TreeNode temp=q.remove();
        if(temp.left!=null){
            q.add(temp.left);
            if(temp.left.left==null && temp.left.right==null){
                s+=temp.left.val;
            }
        }
        if(temp.right!=null){
            q.add(temp.right);
        }
        return sum(q,s);

    }
}