package mergeTwoSortedList;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode next = new ListNode(0);
		

		if (null == l1) {
			return l2;
		}

		if (null == l2) {
			return l1;
		}

		ListNode result =next;
		
		while (null != l1 || null != l2) {

			if (null == l1) {
				next.next = l2;
				break;
			}
			if (null == l2) {
				next.next = l1;
				break;
			}
			if (l1.val > l2.val) {
				next.next = l2;
				l2 = l2.next;
			} else {
				next.next = l1;
				l1 = l1.next;
			}
			next = next.next;
		}

		return result.next;
	}
}