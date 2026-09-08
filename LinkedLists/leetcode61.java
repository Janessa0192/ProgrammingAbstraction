class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode temp=head;
        int len=1;

        if(head==null) return null;
        
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        
        k=k%len;
        temp.next=head;
        int rotate = len-k;

        for(int i=0;i<rotate;i++){
            temp=temp.next;
        } 
        ListNode newHead = temp.next;
        temp.next = null;
        head = newHead;
        return head;
    }
}