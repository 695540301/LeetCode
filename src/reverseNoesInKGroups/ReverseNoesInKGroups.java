package reverseNoesInKGroups;



public class ReverseNoesInKGroups {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ListNode aListNode = new ListNode(1);
		ListNode bListNode = new ListNode(2);
		ListNode cListNode = new ListNode(3);
		ListNode dListNode = new ListNode(4);
		ListNode eListNode = new ListNode(5);
		aListNode.next=bListNode;
		bListNode.next=cListNode;
		cListNode.next=dListNode;
		dListNode=eListNode;
		Solution solution =new Solution();
		solution.reverseKGroup(aListNode, 2);
		

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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
    	
    	
    	ListNode curNode =head;
    	ListNode startNode= curNode;
    	
    	int count =0;
    	
    	while(curNode!=null)
    	{
    		  ++count;
    		if(count==k)
    		{
    			count=0;
    			ListNode next=startNode.next;
    			ListNode temphead =next;
    			// TODO Auto-generated method stub
    			while(next!=curNode)
    			{
    				System.out.println(startNode.val);
    				startNode.next=next.next;
    				next.next=temphead;
    				temphead =next;
    				next=startNode.next;
    				
    			}
    			
    			if(curNode.next==null)
    			{
    				curNode.next =temphead;
    				startNode.next =null;
    			}
    			else 
    			{
    				next= curNode.next;
    				curNode.next = temphead;
    				startNode.next =next;
    				
    			}

    		}
    		
            curNode=curNode.next;  
    		
    	}
        
    	return head;
    }

	private void reverseKNode(ListNode startNode, ListNode curNode) 
	{
		ListNode next=startNode.next;
		ListNode head =next;
		// TODO Auto-generated method stub
		while(next!=curNode)
		{
			System.out.println(startNode.val);
			startNode.next=next.next;
			next.next=head;
			head =next;
			next=startNode.next;
			
		}
		
		if(curNode.next==null)
		{
			curNode.next =head;
			startNode.next =null;
		}
		else 
		{
			next= curNode.next;
			curNode.next = head;
			startNode.next =next;
			
		}
			
		
		
	}
}