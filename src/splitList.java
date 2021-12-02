public class splitList {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode h=head;
        ListNode[] l=new ListNode[k];
        if(head==null){
            return l;
        }
        int c=0;
        while(h!=null){
            c++;
            h=h.next;
        }
        int size=0;

        if(c<=k){
            ListNode[] a=new ListNode[k];
            ListNode temp=head;
            for(int i=0;i<a.length;i++){
                a[i]=temp;
                if(temp.next!=null){
                    temp=temp.next;
                }
                else{
                    break;
                }
            }
            for(int i=0;i<a.length;i++){
                if(a[i]!=null){
                    a[i].next=null;
                }
            }
            return a;
        }
        else if(c%k==0){
            size=c/k;
            ListNode[] a=new ListNode[k];
            ListNode temp=head;
            for(int i=0;i<a.length;i++){
                int x=size;
                ListNode t=temp;
                //  ListNode t1=t;
                while(x-->0 && temp.next!=null){
                    //  t=t.next;
                    temp=temp.next;
                }
                a[i]=t;
            }
            for(int i=0;i<a.length;i++){
                ListNode l2=a[i];
                int i2=size;
                while(i2-->1 && l2.next!=null){
                    l2=l2.next;
                }
                l2.next=null;
            }
            return a;
        }
        else{
            size=c/k;
            int rem=c%k;
            ListNode[] a=new ListNode[k];
            ListNode temp=head;
            for(int i=0;i<a.length;i++){
                int z=size;
                a[i]=temp;
                while(z-->0 && temp!=null){
                    temp=temp.next;
                }
                if(i<rem){
                    if(temp.next!=null){
                        temp=temp.next;
                    }
                }
            }
            for(int i=0;i<a.length;i++){
                ListNode l1=a[i];
                int end=size;
                while(end-->1){
                    l1=l1.next;
                }
                if(i<rem && l1.next!=null){
                    l1=l1.next;
                }
                if(l1.next!=null){
                    l1.next=null;
                }
            }
            return a;
        }
    }
}