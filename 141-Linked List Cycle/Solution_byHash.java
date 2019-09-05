// Space complexity : O(n)
//Time complexity : O(n)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution_byHash {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
		 
		 while(1 == 1)
			 if(head == null)
				 return false;
			 else if(set.contains(head))
				 return true;
			 else
			 {
				 set.add(head);
				 head = head.next;
			 }
    }
}
