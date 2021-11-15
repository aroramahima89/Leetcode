import java.util.*;
public class intersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(a.contains(nums2[i])){
                b.add(nums2[i]);
                a.remove(new Integer(nums2[i]));
            }
        }

        int[] arr=new int[b.size()];
        for(int i=0;i<b.size();i++){
            arr[i]=b.get(i);
        }
        return arr;
    }
}