package removeNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {

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
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tempHead = head;
		ListNode tempCur =head;
		for(int i=0;i<n;++i)
		{
			tempCur = tempCur.next;
		}
          
		if(tempCur == null)
		{
			return head.next;
		}
		
	    while(tempCur.next!=null)
	    {
	    	tempHead =tempHead.next;
	    	tempCur=tempCur.next;
	    }
		
	    if(tempHead.next.next!=null)
	    {
	    	tempHead.next = tempHead.next.next;
	    }
	    else 
	    {
	    tempHead.next =null;	
	    }
		
		return head;
	}
}