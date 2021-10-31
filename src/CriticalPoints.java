
import java.util.*;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class CriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr=new int[2];
        arr[0]=arr[1]=-1;
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        ArrayList<Integer> c=new ArrayList<Integer>();
        ListNode temp=head;
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        for(int i=1;i<a.size()-1;i++){
            if((a.get(i)>a.get(i-1) && a.get(i)>a.get(i+1)) || (a.get(i)<a.get(i-1) && a.get(i)<a.get(i+1))){
                b.add(i);
            }
        }
        if(b.size()>1){
            int min=a.size();
            int max=b.get(b.size()-1)-b.get(0);
            for(int i=0;i<b.size()-1;i++){
                if(b.get(i+1)-b.get(i)<min){
                    min=b.get(i+1)-b.get(i);
                }
            }
            arr[0]=min;
            arr[1]=max;
        }

        return arr;
    }
}