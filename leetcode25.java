/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode findkthNode(ListNode head,int k){

        ListNode curr = head;
       
        k-=1;

        while(curr!=null && k>0){
            curr = curr.next;
            k -= 1;
        }

        return curr;
    }

    public ListNode reverseLl(ListNode temp){

        ListNode curr = temp;
        ListNode agla = null;
        ListNode prev = null;

        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;
        ListNode nextNode = null;
        ListNode prevNode = null;
        
        while(temp!=null){

            ListNode kthNode = findkthNode(temp,k);
            if (kthNode == null) {

                
                if (prevNode != null) {
                    prevNode.next = temp;
                }

                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            reverseLl(temp);

            if(temp==head){
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
}