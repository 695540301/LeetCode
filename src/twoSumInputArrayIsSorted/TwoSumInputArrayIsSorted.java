package twoSumInputArrayIsSorted;

import java.util.HashMap;
import java.util.Map;

public class TwoSumInputArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
	}

}

class Solution {
	public int[] twoSum(int[] numbers, int target) 
	{
		int index[] = new int[2];
		Map map = new HashMap<Integer, Integer>();
		int length = numbers.length;

		for (int i = 0; i < length; ++i) 
		{
			map.put(numbers[i], i);
		}

		for (int i = 0; i < length; ++i) 
		{
            int k = target -numbers[i];
            if(map.containsKey(k))
            {
            	k = (int)map.get(k);
            	if(k==i)
            	{
            		continue;
            	}
            	
            	index[0] = i+1;
            	index[1]=k+1;
            	break;
            }
	 	}

		return index;
	}
}