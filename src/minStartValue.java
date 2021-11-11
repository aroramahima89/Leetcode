class minStartValue{
    public int minStartValue(int[] nums) {
        int min=0;
        int m=Integer.MAX_VALUE;
        if(nums.length==1){
            if(nums[0]<=0){
                return nums[0]+1;
            }
            return 1-nums[0];
        }
        for(int i=0;i<nums.length;i++){
            min+=nums[i];
            if(m>min){
                m=min;
            }
        }
        if(m<=0){
            return 1-m;
        }
        return 1;
    }
}