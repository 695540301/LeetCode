package generateParentheses;


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses
{
	public static void main(String[]args)
	{
		
	}

}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arrayList = new ArrayList<String>();
        if(n==0)
        	return arrayList;
        dfs(arrayList,n-1,n,new StringBuilder().append('('));
        return arrayList;
    }

	private void dfs(List<String> arrayList, int left, int right, StringBuilder append) 
	{
		// TODO Auto-generated method stub
		if(left==0&&right==0)
		{
			arrayList.add(append.toString());
			return;
		}
		
		
		if(right<left||left<0||right<0)
		{
			return;
		}
			
		dfs(arrayList, left, right-1, append.append(')'));
		append.deleteCharAt(append.length()-1);
		dfs(arrayList, left-1, right, append.append('('));
        append.deleteCharAt(append.length()-1);
	}
}