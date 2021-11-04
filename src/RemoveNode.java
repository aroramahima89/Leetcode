


class RemoveNode {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode a=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count==1){
            int node=a.val;
            a=a.next;
            return a;
        }
        if(count==n){
            head=head.next;
            return head;
        }
        for(int i=1;i<count-n;i++){
            //  System.out.println(a.val);
            a=a.next;
        }

        int x=a.next.val;
        System.out.println(x);
        a.next=a.next.next;

        //      System.out.println(count);
        return head;
    }
}