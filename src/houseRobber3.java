import java.util.*;
public class houseRobber3 {
   public class TreeNode {
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
    HashMap<TreeNode,Integer> h=new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(h.containsKey(root)){
            return h.get(root);
        }
        int sum1=root.val;
        if(root.left!=null){
            sum1+=rob(root.left.left);
            sum1+=rob(root.left.right);
        }
        if(root.right!=null){
            sum1+=rob(root.right.left);
            sum1+=rob(root.right.right);
        }
        int sum2=rob(root.left)+rob(root.right);
        int res=Math.max(sum1,sum2);
        h.put(root,res);
        return res;
    }
}