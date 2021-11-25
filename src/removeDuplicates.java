public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int curr=0;
        int next=1;
        if(nums.length==0){
            return 0;
        }
        while(next!=nums.length){
            if(nums[curr]==nums[next]){
                next++;
            }
            else{
                nums[curr+1]=nums[next];
                curr++;
            }
        }
        return curr+1;
    }
}