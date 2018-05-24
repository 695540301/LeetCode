package zigZagConversion;

import java.awt.List;
import java.util.ArrayList;

public class ZigZagConversion {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.convert("PAYPALISHIRING", 3));
		System.out.println(solution.convert("A", 2));
	}

}

class Solution {
	public String convert(String s, int numRows) {

		int length = s.length();
		StringBuffer[] buffer = new StringBuffer[length];
		int index = 0;
		StringBuffer result = new StringBuffer();
		
		for(int i =0;i<length;++i)
		{
			buffer[i]=new StringBuffer();
		}
		
		while (index < length) {
			for (int i = 0; i < numRows&&index<length; ++i) {
				buffer[i].append(s.charAt(index++));
			}

			for (int i = numRows - 2; i > 0&&index<length; --i) {
				buffer[i].append(s.charAt(index++));
			}

		}
		for (StringBuffer tmp : buffer) {
			result.append(tmp);
		}
		return result.toString();
	}
}
// PAHNAPLSIIGYIR