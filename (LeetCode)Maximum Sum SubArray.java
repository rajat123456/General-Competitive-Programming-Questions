/* Problem-> https://leetcode.com/problems/maximum-subarray/description/
   Using Kadane's Algorithm's Dynamic Programming Approach
   Time Comp-> O(n)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        
    int previous_sum=nums[0];
	int overall_sum=nums[0];
	
	for(int i=1;i<nums.length;i++)
	{
	    previous_sum=Math.max(nums[i], nums[i]+previous_sum);
	    
	    if(previous_sum>overall_sum)
	    overall_sum=previous_sum;
	}
	
    return overall_sum;        
    }
}
