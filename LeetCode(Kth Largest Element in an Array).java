//Problem-> https://leetcode.com/problems/kth-largest-element-in-an-array/description/

class Solution {
    public int findKthLargest(int[] nums, int k) {
 
        
      int greater=0;
      int counter=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>greater)
          greater=nums[i];
      }
      
      int[]hash=new int[greater+1];
      
      for(int j=0;j<nums.length;j++)
      {
          if(nums[j]>=0)
        ++hash[nums[j]];
      }
      
      for(int q=hash.length-1;q>=0;q--)
      { 
        if(hash[q]>0)
        {
          counter+=hash[q];
        }
        
        if(counter>=k)
          return q;
        
      }
  return -1;
        
    }
}
