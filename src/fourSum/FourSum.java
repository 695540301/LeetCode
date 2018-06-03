package fourSum;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {

	}
}

// 超时
class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> results = new ArrayList<>();

		if (nums == null || nums.length < 4 || nums[0] > 0 && target < 0 || nums[nums.length - 1] < 0 && target > 0) {
			return results;
		}

		fourSumDfs(nums, 0, target, new ArrayList<>(), results, 4);

		return results;

	}

	private void fourSumDfs(int[] nums, int index, int target, ArrayList<Integer> arrayList,
			List<List<Integer>> results, int depth) {
		// TODO Auto-generated method stub
		if (arrayList.size() == depth) {
			if (cacculateSums(arrayList) == target) {
				results.add(new ArrayList<>(arrayList));
				return;
			}
		}

		if (index >= nums.length) {
			return;
		}

		for (int i = index; i < nums.length; ++i) {
			if (i > index && nums[i] == nums[i - 1]) {
				continue;
			}

			if (cacculateSums(arrayList, nums[i]) > target && nums[i] > 0) {
				continue;
			}

			arrayList.add(nums[i]);
			fourSumDfs(nums, i + 1, target, arrayList, results, depth);
			arrayList.remove(arrayList.size() - 1);

		}

	}

	private int cacculateSums(ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (Integer temp : arrayList) {
			sum += temp;
		}

		return sum;
	}

	private int cacculateSums(ArrayList<Integer> arrayList, int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (Integer temp : arrayList) {
			sum += temp;
		}
		sum += num;
		return sum;
	}
}

// 参考
class Solution1 {
	public List<List<Integer>> fourSum(int[] num, int target) {
		List<List<Integer>> result = new LinkedList<>();
		if (num == null || num.length < 4) {
			return result;
		}

		Arrays.sort(num); // 对数组进行排序

		for (int i = 0; i < num.length - 3; i++) { // 第一个加数
			if (i > 0 && num[i] == num[i - 1]) { // 第一个加数使用不重复
				continue;
			}

			for (int j = num.length - 1; j > i + 2; j--) { // 第四个加数
				if (j < num.length - 1 && num[j] == num[j + 1]) { // 第四个加数使用不重复
					continue;
				}

				int start = i + 1; // 第二个加数
				int end = j - 1; // 第三个加数
				int n = target - num[i] - num[j];

				while (start < end) {
					if (num[start] + num[end] == n) {
						List<Integer> four = new ArrayList<>(4);
						four.add(num[i]);
						four.add(num[start]);
						four.add(num[end]);
						four.add(num[j]);

						result.add(four);

						do {
							start++;
						} while (start < end && num[start] == num[start - 1]); // 保证再次使用第二个数不重复

						do {
							end--;
						} while (start < end && num[end] == num[end + 1]); // 保证再次使用第三个数不重复
					} else if (num[start] + num[end] < n) {
						do {
							start++;
						} while (start < end && num[start] == num[start - 1]); // 保证再次使用第二个数不重复
					} else {
						do {
							end--;
						} while (start < end && num[end] == num[end + 1]); // 保证再次使用第三个数不重复
					}
				}
			}
		}

		return result;
	}

}