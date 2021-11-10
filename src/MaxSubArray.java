class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int s=0;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(s+nums[i]>nums[i]){
                s+=nums[i];
            }
            else{
                s=nums[i];
            }
            if(m<s){
                m=s;
            }
        }
        return m;
    }
}