class sumRootToLeaf {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int sumNumbers(TreeNode root) {
        int x=0;
        int s=0;
        return sum(x,s,root);
    }
    public int sum(int x,int s,TreeNode root){
        TreeNode temp=root;
        s+=temp.val;
        if(temp.left==null && temp.right==null){
            x+=s;
            //   System.out.println(x);
            return x;
        }
        int a=0;
        int b=0;
        if(temp.left!=null){
            a=sum(x,s*=10,temp.left);
            s/=10;
        }
        // s/=10;
        if(temp.right!=null){
            b=sum(x,s*=10,temp.right);
        }
        return a+b;
    }
}
