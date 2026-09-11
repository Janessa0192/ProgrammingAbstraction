class Solution {

    public ListNode merge(ListNode list1,ListNode list2){

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(list1!=null && list2!=null){
            
            if(list1.val<=list2.val){
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        while(list1!=null){
            temp.next = list1;
            list1=list1.next;
            temp=temp.next;
        }

        while(list2!=null){
            temp.next = list2;
            list2=list2.next;
            temp=temp.next;
        }

        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null) return head;

        ListNode slow = head; ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(second);

        return merge(left,right);
    }
}