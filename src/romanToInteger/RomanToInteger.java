package romanToInteger;

public class RomanToInteger {
	public static void main(String[] args) 
	{
		Solution solution = new Solution();
		System.out.print(solution.romanToInt("CMLII"));

	}

}

class Solution {
	public int romanToInt(String s) {
		int value = 0;
		int length = s.length();
		char temp;

		for (int i = 0; i < length; ++i) {
			temp = s.charAt(i);
			switch (temp) {
			case 'I':
				++value;
				break;
			case 'V':
				value += 5;
				if (i - 1 >=0) {
					if (s.charAt(i - 1) == 'I') {
						value-=2;
					}
				}
				break;
			case 'X':
				value += 10;
				if (i - 1 >=0) {
					if (s.charAt(i - 1) == 'I') {
						value-=2;
					}
				}
				break;
			case 'L':
				value += 50;
				if (i - 1 >=0) {
					if (s.charAt(i - 1) == 'X') {
						value-=20;
					}
				}
				break;
			case 'C':
				value += 100;
				if (i - 1 >=0) {
					if (s.charAt(i - 1) == 'X') {
						value-=20;
					}
				}
				break;
			case 'D':
				value += 500;
				if (i - 1 >=0) {
					if (s.charAt(i - 1) == 'C') {
						value-=200;
					}
				}
				break;
			case 'M':
				value += 1000;
				if (i - 1 >=0) {
					if (s.charAt(i - 1) == 'C') {
						value-=200;
					}
				}
				break;
			default:
				break;
			}

		}

		return value;

	}
}