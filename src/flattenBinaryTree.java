import java.util.*;
public class flattenBinaryTree {
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
      public void flatten(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        if(root!=null){
            Stack<TreeNode> q=new Stack<TreeNode>();
            q.push(root);
            while(!q.isEmpty()){
                TreeNode temp=q.pop();
                a.add(temp.val);
                if(temp.right!=null){
                    q.push(temp.right);
                }
                if(temp.left!=null){
                    q.push(temp.left);
                }

            }
            root.left=null;
            root.right=null;
            TreeNode x=root;
            a.remove(0);
            while(!a.isEmpty()){
                x.left=null;
                x.right=new TreeNode(a.get(0));
                a.remove(0);
                x=x.right;
            }
        }

    }
}