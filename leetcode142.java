public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) break;
        }

        if(fast==null || fast.next==null) return null;

       // means we are sure we have found cycle and surely have a start
       // point so we just find it 
        ListNode temp = head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }

        return slow;

    }
}