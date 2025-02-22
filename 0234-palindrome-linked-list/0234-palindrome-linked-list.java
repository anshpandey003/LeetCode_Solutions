class Solution {
    public boolean isPalindrome(ListNode head) {
        
        // ListNode temp = head;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr = slow, prev = null, next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        boolean isPalin=true;
        ListNode p1 = head, p2 = prev;
        while(p2 != null){
            if(p1.val!=p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
