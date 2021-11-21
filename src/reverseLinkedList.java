public class reverseLinkedList {

  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        if(head==null){
            return head;
        }
        ListNode temp=head;
        ListNode next=head;
        while(temp.next!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        temp.next=prev;
        return temp;
    }
}