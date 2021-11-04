import java.util.*;
class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int a=0;
        int b=0;
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                func(nums[i],i+1,nums.length-1,nums,0-nums[i],res);
            }
        }
        return res;
    }
    public void func(int a,int i,int j,int[] nums,int target,List<List<Integer>> res){
        while(i<j){
            if(nums[i]+nums[j]<target){
                i++;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                List<Integer> l=new ArrayList<Integer>();
                l.add(a);
                l.add(nums[i]);
                l.add(nums[j]);
                res.add(l);

                //duplicates
                while(i<j && nums[i]==nums[i+1]){
                    i++;
                }
                while(i<j && nums[j]==nums[j-1]){
                    j--;
                }
                i++;
                j--;
            }
        }
    }
}