package intToRoman;

public class IntToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.intToRoman(1994));
	}

}

class Solution {
	public String intToRoman(int num) {
		StringBuffer buffer = new StringBuffer();
		while (num >= 1000) {
			buffer.append('M');
			num -= 1000;
		}

		while (num >= 900) {
			buffer.append('C').append('M');
			num -= 900;
		}

		while (num >= 500) {
			buffer.append('D');
			num -= 500;
		}

		while (num >= 400) {
			buffer.append('C').append('D');
			num -= 400;
		}

		while (num >= 100) {
			buffer.append('C');
			num -= 100;
		}

		while (num >= 90) {
			buffer.append('X').append('C');
			num -= 90;
		}
		
		while (num >= 50) {
			buffer.append('L');
			num -= 50;
		}
		
		while (num >= 40) {
			buffer.append('X').append('L');
			num -= 40;
		}
		
		while (num >= 10) {
			buffer.append('X');
			num -= 10;
		}

		while (num >= 9) {
			buffer.append('I').append('X');
			num -= 9;
		}

		while (num >= 5) {
			buffer.append('V');
			num -= 5;
		}

		while (num >= 4) {
			buffer.append('I').append('V');
			num -= 4;
		}

		while (num >= 1) {
			buffer.append('I');
			--num;
		}

		return buffer.toString();

	}
}