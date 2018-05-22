package subject20;

import java.util.Stack;

public class Subject20 {
	public static void main(String[]args)
	{
		Solution solution = new Solution();
		System.out.println(solution.isValid("()"));
		System.out.println(solution.isValid("()[]{}"));
		System.out.println(solution.isValid("(]"));
		System.out.println(solution.isValid("([)]"));
		System.out.println(solution.isValid( "{[]}"));

	}

}

class Solution {
	public boolean isValid(String s) {
		boolean value = true;
		Stack<Character> stack = new Stack<>();
		char[] arrays = s.toCharArray();
		char temp = 0;
		for (char c : arrays) {

			
			if(!stack.empty())
			{
			 temp = stack.peek();
			}
			switch (c) {

			case ')':
				if (temp != '(') {
					value = false;
				} else {
					stack.pop();
				}
				break;
			case '}':
				if (temp != '{') {
					value = false;
				} else {
					stack.pop();
				}
				break;
			case ']':
				if (temp != '[') {
					value = false;
				} else {
					stack.pop();
				}
				break;
			default:
				stack.push(c);
				break;

			}
			if (!value) {
				break;
			}

		}

		if(!stack.isEmpty())
		{
			value =false;
		}
		return value;
	}
}