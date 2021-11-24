import java.util.*;
public class BstToGst {
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

    public TreeNode bstToGst(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            a.add(temp.val);
            sum+=temp.val;
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        Collections.sort(a);
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<a.size()-1;i++){
            b.add(sum);
            sum-=a.get(i);
        }
        b.add(a.get(a.size()-1));
        Queue<TreeNode> qu=new LinkedList<TreeNode>();
        qu.add(root);
        while(!qu.isEmpty()){
            TreeNode temp=qu.remove();
            int x=a.indexOf(temp.val);
            TreeNode t=temp;
            temp.val=b.get(x);
            //   System.out.print(temp.val+" ");
            if(t.left!=null){
                qu.add(t.left);
            }
            if(t.right!=null){
                qu.add(t.right);
            }
        }
        return root;
    }
}