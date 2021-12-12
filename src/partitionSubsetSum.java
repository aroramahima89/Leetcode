public class partitionSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1){
            return false;
        }
        return fun(nums,sum/2);
    }
    public boolean fun(int[] nums,int sum){
        boolean[][] res=new boolean[nums.length+1][sum+1];
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<=sum;j++){
                if(i==0 || j==0){
                    res[i][j]=false;
                }
            }
        }
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=sum;j++) {
                if (nums[i - 1] < j) {
                    res[i][j] = res[i - 1][j] || res[i - 1][j - nums[i - 1]];
                } else if (nums[i - 1] == j) {
                    res[i][j] = true;
                } else {
                    res[i][j] = res[i - 1][j];
                }
            }
        }
        return res[nums.length][sum];
    }
}