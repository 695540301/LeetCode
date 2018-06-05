package letterCombinationsOfAPhoneNumber;


import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public List<String> letterCombinations(String digits) {
 
    	ArrayList<String> list = new ArrayList<>();
    	String[] phoneNumbers = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    	dfsPhoneNumbers(digits,0,phoneNumbers,list,new StringBuffer());
    	
    	return list;
    }

	private void dfsPhoneNumbers(String digits,int index, String[] phoneNumbers, ArrayList<String> list,StringBuffer buffer) 
	{
		// TODO Auto-generated method stub
		if(index==digits.length())
		{
			list.add(buffer.toString());
			return;
		}
		String phoneNumberString = phoneNumbers[digits.charAt(index)-'0'];
		
		for(int i=0;i<phoneNumberString.length();++i)
		{
			buffer.append(phoneNumberString.charAt(i));
			dfsPhoneNumbers(digits, index+1, phoneNumbers, list, buffer);
			buffer.deleteCharAt(buffer.length()-1);
		}
	    
		
	}
}