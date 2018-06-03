package searchInsertPosition;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int searchInsert(int[] nums, int target) 
    {
    	int position = -1;
    	for(int i=0;i<nums.length;++i)
    	{
    		if(nums[i]>=target)
    		{
    			position=i;
    			break;
    		}
    	}
    	
    	
    	if(position<0)
    	{
    		position = nums.length;
    	}
        
    	return position;
    }
}