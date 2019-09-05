//Time and Space Complexity : O(n)

import java.util.HashMap;

public class SolutionHash {

	public static void main(String[] args) {
		ListNode list = new ListNode(0);
		list.next = new ListNode(1);
		list.next.next = new ListNode(2);
		list.next.next.next = new ListNode(3);
		list.next.next.next.next = new ListNode(4);
		list.next.next.next.next.next = new ListNode(5);
		list.next.next.next.next.next.next = new ListNode(6);
		ListNode dummy = list.next.next;
		list.next.next.next.next.next.next.next = dummy;
		
		System.out.println(detectCycle(list).val);

	}

public static  ListNode detectCycle(ListNode head) {
        
	HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
	ListNode result = null;
	ListNode iter = head;
	int location = -1;
	
	while(iter != null && iter.next != null)
	{
		if(map.containsKey(iter))
		{
			//System.out.print("here");
			result = iter;
			break;
		}
		else
		{
			location++;
		}
		
		map.put(iter, location);
		iter = iter.next;
		
	}
	
	return result;
	
    }
}
