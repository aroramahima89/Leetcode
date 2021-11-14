import java.util.*;
class postorderTraversal{
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>();
        if(root==null){
            return a;
        }
        Stack<TreeNode> s1=new Stack<TreeNode>();
        Stack<TreeNode> s2=new Stack<TreeNode>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode temp=s1.pop();
            //     System.out.println(temp.val);
            s2.push(temp);
            if(temp.left!=null){
                s1.push(temp.left);
            }
            if(temp.right!=null){
                s1.push(temp.right);
            }
        }
        while(!s2.isEmpty()){
            TreeNode x=s2.pop();
            a.add(x.val);
        }
        return a;
    }
}