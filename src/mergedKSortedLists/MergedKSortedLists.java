package mergedKSortedLists;



public class MergedKSortedLists {

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

class Solution 
{
	public ListNode mergeKLists(ListNode[] lists) 
	{
		if(lists.length==0||null==lists)
		{
			return null;
		}
		
		if(lists.length==1)
		{
			return lists[0];
		}
		
		for(int i =0;i<lists.length-1;++i)
		{
			lists[i+1]=mergeTwoLists(lists[i],lists[i+1]);
			
		}
            
		return lists[lists.length-1];
	}
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