package removeDuplicateFromSortedArray;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

	class Solution 
	{
	    public int removeDuplicates(int[] nums) 
	    {
	    	int length=nums.length;
	         Arrays.sort(nums);
	         for(int i=nums.length-1;i>0;--i)
	         {
	        	 if(nums[i]==nums[i-1])
	        	 {
	        		 length--;
	        		 for(int j=i;j<length;++j)
	        		 {
	        			 nums[j]=nums[j+1];
	        		 }
	        	 }
	         }
	         return length;
		
	         
	    }
	}
}
