public class sortedArrayToBST {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==1){
            TreeNode node=new TreeNode(nums[0]);
            return node;
        }
        return BST(nums,0,nums.length-1);
    }
    public TreeNode BST(int[] nums,int beg,int end){
        if(beg>end){
            return null;
        }
        int mid=(beg+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=BST(nums,beg,mid-1);
        root.right=BST(nums,mid+1,end);
        return root;
    }
}