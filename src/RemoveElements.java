
class RemoveElements {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while(head.val==val){
            if(head.next==null){
                return head.next;
            }
            head=head.next;
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==val){
                int x=temp.next.val;
                temp.next=temp.next.next;
            }
            else if(temp.next!=null){
                temp=temp.next;
            }
        }

        return head;
    }
}