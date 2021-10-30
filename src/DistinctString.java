import java.util.*;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> a=new ArrayList<String>();
        ArrayList<Integer> val=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(!a.contains(arr[i])){
                a.add(arr[i]);
                val.add(1);
            }
            else{
                val.set(a.indexOf(arr[i]),val.get(a.indexOf(arr[i]))+1);
            }
        }
        int x=0;
        for(int i=0;i<a.size();i++){
            if(val.get(i)==1){
                x++;
            }
            if(x==k){
                return a.get(i);
            }
        }
        return "";
    }
}