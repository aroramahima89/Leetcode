public class oddEvenLinkedList {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode oddEvenList(ListNode head) {
        if(head==null ||head.next==null ||head.next.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode eh=even;
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            even.next=odd.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=eh;
        return head;
    }
}