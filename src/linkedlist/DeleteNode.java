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
    public ListNode modifiedList(int[] a, ListNode head) {
        ListNode tmp = head;

        Set<Integer>set=new HashSet<>();
        for(int i:a)set.add(i);
        //tmp.next != null &&
        while(head!=null && set.contains(head.val)) head=head.next;
        while(tmp!=null && tmp.next!=null) {
          if( set.contains(tmp.next.val)) {
            tmp.next = tmp.next.next;
          } else{
          tmp = tmp.next;
          }
        }
        return head;
    }
}
