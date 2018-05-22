package test8;



public class Test8 
{
	public static void main(String[]args)
	{
		Solution solution = new Solution();
		System.out.println(solution.myAtoi(""));
	}

}

class Solution {

	public final int MAX_NUM = (int) (Math.pow(2, 31) - 1);
	public final int MIN_NUM = (int) (-1 * Math.pow(2, 31));

	public int myAtoi(String str) {
		str = str.trim();
		char[] chars = str.toCharArray();
		boolean startFlag = false;
		boolean positiveFlag = true;
		int tempNum = 0, num = 0;

		for (int i = 0; i < chars.length; ++i) {
			if (!startFlag) {
				if (chars[i] >= '0' && chars[i] <= '9') {
					startFlag = true;

				}
				if (chars[i] == '+') {
					startFlag = true;
					continue;
				}
				if (chars[i] == '-') {
					startFlag = true;
					positiveFlag = false;
					continue;
				}
			}

			if (chars[i] > '9' || chars[i] < '0') {
				break;
			}

			tempNum = num;
			int addNum = chars[i] - '0';
			if (tempNum < 0) {
				num = num * 10 - addNum;
				if (num > 0 || num % 10 != -addNum) {
					num = MIN_NUM;
					break;
				}
			} else {
				num = num * 10 + (addNum);
				if (num < 0 || num % 10 != addNum) {
					num = MAX_NUM;
					break;
				}
			}
			if (!positiveFlag && num > 0) {
				num = -num;
			}

		}

		return num;
	}
}