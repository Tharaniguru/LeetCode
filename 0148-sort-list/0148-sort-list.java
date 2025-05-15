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
    public ListNode sortList(ListNode head) {
        ListNode ref = head;
        if(ref==null||ref.next==null){
            return head;
        }
        List<Integer> li = new ArrayList<>();
        while(ref!=null){
            li.add(ref.val);
            ref = ref.next;
        }
        Collections.sort(li);
        for(int i=0;i<li.size();i++){
            if(i==0){
                head = new ListNode(li.get(0));
                ref = head;
            }
            else{
                ref.next = new ListNode(li.get(i));
                ref = ref.next;
            }
            
        }
        return head;
    }
}