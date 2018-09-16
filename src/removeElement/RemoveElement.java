package removeElement;

public class RemoveElement {

	class Solution {
	    public int removeElement(int[] nums, int val) 
	    {
	    	int length = nums.length;
	    	int result=length;
	    	for(int i=length-1;i>=0;--i)
	    	{
	    		if(nums[i]==val)
	    		{
	    			for(int j=i;j<result-1;++j)
	    			{
	    				nums[j]=nums[j+1];
	    			}
	    			--result;
	    		}
	    		
	    	}
	    	
	    	
	    	return result;
	        
	    }
	}
}
