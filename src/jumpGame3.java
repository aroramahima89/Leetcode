import java.util.*;
public class jumpGame3 {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q=new LinkedList<Integer>();
        boolean[] visited=new boolean[arr.length];
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int x=q.remove();
            if(arr[x]==0){
                return true;
            }
            if(x+arr[x]<arr.length){
                if(!visited[x+arr[x]]){
                    visited[x+arr[x]]=true;
                    q.add(x+arr[x]);
                }
            }
            if(x-arr[x]>=0){
                if(!visited[x-arr[x]]){
                    visited[x-arr[x]]=true;
                    q.add(x-arr[x]);
                }
            }
        }
        return false;
    }
}