import java.util.*;
public class jumpGame {
    public boolean canJump(int[] nums) {
        Queue<Integer> q=new LinkedList<Integer>();
        boolean[] visited=new boolean[nums.length];
        q.add(0);
        visited[0]=true;
        if(nums[0]>=nums.length-1){
            return true;
        }
        while(!q.isEmpty()){
            int x=q.remove();
            if(x+nums[x]>=nums.length){
                return true;
            }
            int i=1;
            while(x+i<=x+nums[x]){
                if((x+i+nums[x+i])>=(nums.length-1)){
                    return true;
                }
                if(!visited[x+i]){
                    visited[x+i]=true;
                    q.add(x+i);
                }
                i++;
            }
        }
        return false;
    }
}