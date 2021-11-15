import java.util.*;
class sameTree{
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        Queue<TreeNode> a=new LinkedList<TreeNode>();
        Queue<TreeNode> b=new LinkedList<TreeNode>();
        a.add(p);
        b.add(q);
        while(!a.isEmpty()){
            TreeNode t1=a.remove();
            if(b.isEmpty()){
                //   System.out.println("a");
                return false;
            }
            TreeNode t2=b.remove();
            if(t1.val!=t2.val){
                return false;
            }
            if(t1.left!=null && t2.left!=null){
                //        if(t1.left.val!=t2.left.val){
                //          return false;
                //    }
                a.add(t1.left);
                b.add(t2.left);
            }
            if((t1.left==null &&t2.left!=null) || (t1.left!=null &&t2.left==null)){
                return false;
            }
            if(t1.right!=null && t2.right!=null){
                //            if(t1.right.val!=t2.right.val){
                //             return false;
                //       }
                a.add(t1.right);
                b.add(t2.right);
            }
            if((t1.right==null &&t2.right!=null) || (t1.right!=null &&t2.right==null)){
                return false;
            }
        }
        return true;
    }
}