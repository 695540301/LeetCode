package containerWithMostWater;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.maxArea(new int[] {1,2,3}));

	}

}
class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int left = 0,right = length-1;
        int result =0;
        
        while(left<right)
        {
        	int temp =Math.min(height[left], height[right]);
        	result = Math.max(result, (right-left)*temp);
        	if(temp==height[left])
        	{
        		left++;
        	}
        	else
        	{
        		right--;
        	}
        }
        
        return result;
    }
}