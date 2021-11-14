import java.util.*;
class zigzagLevelOrder{
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
    }    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int even=0;
        while(!q.isEmpty()){
            int x=q.size();
            List<Integer> a=new ArrayList<Integer>();
            while(x>0){
                TreeNode temp=q.remove();
                a.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                x--;
            }
            even++;
            if(even%2==0){
                Collections.reverse(a);
            }
            res.add(a);
        }
        return res;
    }
}