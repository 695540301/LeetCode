package longestUncommonSubsequenceI;

public class LongestUncommonSubsequenceI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.findLUSlength("", ""));
	}
}
class Solution {
	public int findLUSlength(String a, String b) {
		int value = 0;
        int lengthA = a.length();
        int lengthB = b.length();
        
        if(lengthA!=lengthB)
        {
        	value =Math.max(lengthA, lengthB);
        }
        else 
        {
        	if(a.equals(b))
        	{
        		value =-1;
        	}
        	else
        	{
        		value =lengthA;
        	}
        }
		
		return value;

	}
}
