public class containsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=k){
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<=k;j++){
                if(i+j<nums.length){
                    if(nums[i]==nums[i+j]){
                        return true;
                    }
                }

            }
        }
        return false;
    }
}