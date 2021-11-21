public class reverseLinkedListRange {
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=null;
        ListNode temp=head;
        if(left==right || head.next==null){
            return head;
        }
        while(left>1){
            prev=temp;
            temp=temp.next;
            left--;
            right--;
        }
        ListNode y=temp;
        ListNode z=prev;
        ListNode next=head;
        while(right>1 && temp.next!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            right--;
        }

        ListNode x=temp.next;
        temp.next=prev;
        if(z==null){
            ListNode a=head;
            a.next=x;
            return temp;
        }
        else{
            z.next=temp;
            y.next=x;
        }
        return head;
    }
}