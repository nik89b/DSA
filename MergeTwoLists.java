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
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode(0);
    ListNode curr = dummyHead;
    while (list1 != null || list2 != null) {
      int x = (list1 != null) ? list1.val : 10000;
      int y = (list2 != null) ? list2.val : 10000;
      if (x <= y) {
        curr.next = new ListNode(x);
        if (list1 != null)
          list1 = list1.next;
      } else {
        curr.next = new ListNode(y);
        if (list2 != null)
          list2 = list2.next;
      }
      curr = curr.next;
    }
    return dummyHead.next;
  }
}
