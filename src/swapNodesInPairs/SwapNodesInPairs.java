package swapNodesInPairs;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
	public ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode extraSpace = head;
		ListNode extraSpace2 = head.next.next;
		head = head.next;
		head.next = extraSpace;
		head.next.next = extraSpace2;
		ListNode tmp = head.next;

		while (tmp != null && tmp.next != null) {
			swapTwoNodes(extraSpace, tmp, tmp.next, tmp.next.next);
			tmp = tmp.next.next;
		}

		return head;
	}

	private void swapTwoNodes(ListNode extraSpace, ListNode tmp, ListNode next, ListNode next2) {
		// TODO Auto-generated method stub
		if (next2 == null) {
			return;
		}
		extraSpace = next2.next;
		tmp.next = next2;
		next2.next = next;
		next.next = extraSpace;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}