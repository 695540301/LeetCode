package threeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.threeSumClosest(new int[] { 0, 2, 1, -3 }, 1));
	}

}

class Solution {
	public int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);
		int result = nums[1] + nums[2] + nums[0];

		int diff = Math.abs(target - result);

		int temp;
		int tempDiff;
	

		//System.out.println(result);
		for (int i = 0; i < nums.length - 2; ++i) 
		{
			int left = i+1;
			int right = nums.length - 1;
			
			while (left < right) {
				temp = nums[i] + nums[left] + nums[right];

				tempDiff = target - temp;
				if (tempDiff > 0) {
					++left;
				} else {
					--right;
				}
				if (diff > Math.abs(tempDiff)) {
					diff = Math.abs(tempDiff);
					result = temp;

				}

				if (diff == 0) {
					break;
				}

				// System.out.println(result);
			}
		}
		return result;

	}
}