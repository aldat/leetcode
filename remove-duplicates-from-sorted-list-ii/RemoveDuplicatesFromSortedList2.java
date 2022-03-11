/**
 * Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list. Return the linked list sorted as well.
 * Input: head = [1,2,3,3,4,4,5]
 * Output: [1,2,5]
 * 
 * Result:
 * Runtime: 1 ms, faster than 78.93% of Java online submissions for Remove Duplicates from Sorted List II.
 * Memory Usage: 43.3 MB, less than 57.75% of Java online submissions for Remove Duplicates from Sorted List II.
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null;
        int dup = -500;
        var iter = head;
        while (iter != null) {

            if (iter.next != null && iter.val == iter.next.val) {
                dup = iter.val;
            }

            if (dup == iter.val) {
                if (prev == null) {
                    head = iter.next;
                } else {
                    prev.next = iter.next;
                }
                iter = iter.next;
                continue;
            }

            prev = iter;
            iter = iter.next;
        }
        return head;
    }
}
