class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr=new int[2];
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a.remove(new Integer(nums[i]));
                    a.remove(new Integer(nums[j]));
                }
            }
        }
        arr[0]=a.get(0);
        arr[1]=a.get(1);
        return arr;
    }
}
