package subject4;

public class Subject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3,4 }));
	}

}

class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
        int length = length1+length2;
		
        if(length%2==1)
        {
        	return findKth(nums1, 0, length1, nums2, 0, length2, length / 2 + 1);
        }
        
		return (findKth(nums1, 0, length1, nums2, 0, length2, length/ 2)
				+ findKth(nums1, 0, length1, nums2, 0, length2, length / 2 + 1)) / 2;
	}

	private double findKth(int[] nums1, int start1, int length1, int[] nums2, int start2, int length2, int k) {

		//默认nums[]里面要处理的值比较少
		if(length1-start1>length2-start2)
		{
			return findKth(nums2, start2, length2, nums1, start1, length1, k);
		}
		
	
		//nums1[]里面的值都在前k中
		if(start1==length1)
		{
			return nums2[k-1];
		}
		
		if(k==1)
		{
			return Math.min(nums1[start1], nums2[start2]);
		}
		
	
		int nextStart1 = start1+Math.min(k/2, length1-start1);
		int nextStart2 = start2+(k-nextStart1+start1);
		
		
		if(nums1[nextStart1-1]<=nums2[nextStart2-1])
		{
			return findKth(nums1, nextStart1, length1, nums2, start2, length2, k-nextStart1+start1);
		}
		else 
		{
			return findKth(nums1, start1, length1, nums2, nextStart2, length2, k-nextStart2+start2);
		}
	

	}
}
