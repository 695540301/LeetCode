package longersPalindromicSubsequence;

/*����һ���ַ���s���ҵ�������Ļ��������С����Լ���s����󳤶�Ϊ1000��

ʾ�� 1:
����:

"bbbab"
���:

4
һ�����ܵ������������Ϊ "bbbb"��

ʾ�� 2:
����:

"cbbd"
���:

2
һ�����ܵ������������Ϊ "bb"��*/

public class ValidParentheses {

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