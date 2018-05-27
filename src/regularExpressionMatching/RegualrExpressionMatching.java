package regularExpressionMatching;

public class RegualrExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.isMatch("ab", ".*"));
	}

}

class Solution {
	public boolean isMatch(String s, String p) {

		int sLength = s.length();
		int pLength = p.length();

		if (0 == sLength && 0 == pLength) {
			return true;
		}

		char s0 = getCharWithoutOverSteo(s, 0), p0 = getCharWithoutOverSteo(p, 0), p1 = getCharWithoutOverSteo(p, 1);
		if (isMatchCharacter(s0, p0) || p1 == '*') {
			if (p1 != '*') {
				if (sLength == 0) {
					return false;
				}
				return isMatch(s.substring(1), p.substring(1));

			}

			int i = 0;
			boolean ret = isMatch(s.substring(0), p.substring(2));
			if (ret)
				return ret;
			while (i < sLength && isMatchCharacter(getCharWithoutOverSteo(s, i), p0)) {
				ret = isMatch(s.substring(i + 1), p.substring(2));
				if (ret)
					return ret;
				i++;
			}
		}

		return false;
	}

	private Boolean isMatchCharacter(char a, char b) {

		if (a == b||a=='.'||b=='.') {
			return true;
		}

		return false;

	}

	private Character getCharWithoutOverSteo(String s, int index) {
		if (s.length() > index) {
			return s.charAt(index);
		}
		return 0;
	}
}