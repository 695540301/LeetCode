package subArraySumEqualK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualK {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.subarraySum(new int[] { 1,1,1 }, 2));
	}
}

class Solution {
	public int subarraySum(int[] nums, int k) {
		int sum = 0;
		int subSum = 0;
		int length = nums.length;
		for (int i = 0; i < length; ++i) {
			int start = i;
			while (start < length) {
				subSum += nums[start++];
				if (subSum == k)
				{
					++sum;
                   
				}
			}

			 subSum=0;
		}

		return sum;
	}
}