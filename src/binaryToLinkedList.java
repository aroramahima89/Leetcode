public class binaryToLinkedList {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        ListNode x=head;
        int res=0;
        int i=0;
        while(x!=null){
            res+=(x.val)*Math.pow(2,c-1-i);
            i++;
            x=x.next;
        }
        return res;
    }
}