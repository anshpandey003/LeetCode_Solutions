class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode next = null;
        ListNode  current = head;
            if(current==null){
                 return head;
            }

            while(current.next !=null){
                if(current.val==current.next.val)
                {
                    current.next=current.next.next;
                }
                else{
                    current=current.next;
                }
                
            }
        return head;
    }
}