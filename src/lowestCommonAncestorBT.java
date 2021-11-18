
public class lowestCommonAncestorBT {

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while(true){
            if(BT(root.left,p) && BT(root.right,q)){
                return root;
            }
            if(BT(root.right,p) && BT(root.left,q)){
                return root;
            }
            if(root.val==p.val || root.val==q.val){
                return root;
            }
            while(BT(root.left,p)&&BT(root.left,q)){
                root=root.left;
            }
            while(BT(root.right,p)&&BT(root.right,q)){
                root=root.right;
            }
        }

    }
    public boolean BT(TreeNode root,TreeNode x){
        if(root==null){
            return false;
        }
        if(root.val==x.val){
            return true;
        }
        if(BT(root.left,x)||BT(root.right,x)){
            return true;
        }
        return false;
    }
}