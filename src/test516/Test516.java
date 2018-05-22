package test516;

/*给定一个字符串s，找到其中最长的回文子序列。可以假设s的最大长度为1000。

示例 1:
输入:

"bbbab"
输出:

4
一个可能的最长回文子序列为 "bbbb"。

示例 2:
输入:

"cbbd"
输出:

2
一个可能的最长回文子序列为 "bb"。*/

public class Test516 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.longestPalindromeSubseq("bbbab"));
	}
}

class Solution {
	public int longestPalindromeSubseq(String s) {
		char[] array = s.toCharArray();
		int length = array.length;
		int[][] value = new int[length][length];

		for (int i = length - 1; i >= 0; --i) {
			value[i][i] = 1;
			for (int j = i + 1; j < length; ++j) {
				if (array[i] == array[j]) {
					value[i][j] = value[i + 1][j - 1] + 2;
				} else {
					value[i][j] = Math.max(value[i + 1][j], value[i][j - 1]);
				}
			}
		}

		return value[0][length - 1];
	}
}