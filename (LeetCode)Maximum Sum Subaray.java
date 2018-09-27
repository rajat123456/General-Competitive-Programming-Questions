/* Problem-> https://leetcode.com/problems/maximum-subarray/description/
Maximum Sum Subarray using Divide & Conquer Approach 
Time Comp-> O(N*logN)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        
        return divide(nums,0,nums.length-1);
        
    }
    
    static int divide(int[]arr, int start, int end)
	{
	    if(start==end)
	    return arr[start];
	    
	    int mid=(start+end)/2;
	    
	    int left=divide(arr, start, mid);
	    int right=divide(arr, mid+1, end);
	    int middle=combine(arr, start, end);
	    
	    return Math.max(left, Math.max(right, middle));
	}
    
    static int combine(int[]arr, int left, int right)
	{
	  int mid=(left+right)/2;
	  
	  int leftsum=Integer.MIN_VALUE;
	  int lsum=0;
	  for(int k=mid;k>=left;k--)
	  {
	      lsum+=arr[k];
	      if(lsum>leftsum)
	      leftsum=lsum;
	  }
	  
	  int rightsum=Integer.MIN_VALUE;
	  int rsum=0;
	  for(int k=mid+1;k<=right;k++)
	  {
	      rsum+=arr[k];
	      if(rsum>rightsum)
	      rightsum=rsum;
	  }
	  
	  return leftsum + rightsum;
	}
}
