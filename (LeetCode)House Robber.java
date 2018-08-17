//Problem-> https://leetcode.com/problems/house-robber/description/
//Time Comp-> O(n), "n" is size of array

class Solution {
    public int rob(int[] nums) {
        
      int[]storage=new int[nums.length+1];
      Arrays.fill(storage,-1);
      return maxm(nums,0,storage);
    }
    
    static int maxm(int[]arr, int start, int[]storage)
  {
        
    if(start>=arr.length)
      return 0;
    
    if(storage[start]!=-1)
      return storage[start];
    
    int op1=arr[start]+maxm(arr,start+2,storage);
    int op2=maxm(arr,start+1,storage);
    
    storage[start]=Math.max(op1,op2);
    return storage[start];
  }
}
