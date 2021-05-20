// Problem Link: https://leetcode.com/problems/sort-an-array/submissions/

// Time Complexity: O(N^2)
// Space Complexity: O(1)

class Solution {
    public int[] sortArray(int[] nums) {
     
        
        int index=0;
        for(int q=0; q<nums.length; q++)
        {
            int small=nums[q];
            
            for(int r=q+1; r<nums.length; r++)
            {
              if(nums[r]<small)
              {
                  index=r;
                  small=nums[r];
              }
            }
            
            if(nums[q]!=small)
            {
             int temp=nums[q];
             nums[q]=small;
             nums[index]=temp;
            }
            
        }
        
        return nums;
    }
}
