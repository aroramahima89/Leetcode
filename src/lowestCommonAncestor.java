public class lowestCommonAncestor {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      /*  if(root.val>=p.val && root.val<=q.val){
            if(BST(root.left,p) && BST(root.right,q)){
                return root;
            }
        }
        */
        if(root.left==null ||root.right==null){
            return root;
        }
        while(true){
            if(root.val>=p.val && root.val<=q.val){
                return root;
            }
            if(root.val<=p.val && root.val>=q.val){
                return root;
            }
            while(BST(root.left,p)&&BST(root.left,q)){
                root=root.left;
            }
            while(BST(root.right,p)&&BST(root.right,q)){
                root=root.right;
            }
        }



    /*    if(root.val>=p.val && root.val>=q.val){

            while(BST(root.left,p)&&BST(root.left,q)){
                root=root.left;
            }
            return root;
         }
         if(root.val<=p.val && root.val<=q.val){

            while(BST(root.right,p)&&BST(root.right,q)){
                root=root.right;
            }
            return root;
          }
          */



 /*       if(root.val==p.val){
            if(root.val<q.val){
                BST(root.right,q);
            }
            else{
                BST(root.left,q);
            }
        }
        if(root.val==q.val){
            if(root.val>p.val){
                BST(root.left,p);
            }
            else{
                BST(root.right,p);
            }
        }
        */

       /* if(root.val==p){
            if(BST(root.left,q)||BST(root.right,q)){
                return root.val;
            }
        }
         if(root.val==q){
            if(BST(root.left,p)||BST(root.right,p)){
                return root.val;
            }
        }
        */
    }
    public boolean BST(TreeNode root,TreeNode x){
        if(root==null){
            return false;
        }
        if(root.val==x.val){
            return true;
        }
        if(BST(root.left,x)||BST(root.right,x)){
            return true;
        }
        return false;
    }
}