//Problem-> https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

class Solution {
    public int findPairs(int[] nums, int k) {
       if(k<0)
           return 0;
        
        int counter=0;
        HashMap<Integer,Integer>map=new HashMap<>();
      
      for(int i=0;i<nums.length;i++)
      {
        if(map.containsKey(nums[i]))
        {
          int count=map.get(nums[i]);  
          map.put(nums[i],count+1);
        }
          
          else
          {
              map.put(nums[i],1);
          }
        
      }
      
      for(int q=0;q<nums.length;q++)
      {
        if(!map.containsKey(nums[q]))
            continue;
        int first=nums[q]+k;
        int second=nums[q]-k;

        if(nums[q]==first || nums[q]==second)
        {
            int gett=map.get(nums[q]);
            if(gett>1)
            {
            ++counter;
            }
            map.remove(nums[q]);
            continue;
        }
          
        if(map.containsKey(first) && map.containsKey(second))
        {
          counter+=2;
          //map.remove(first);
          //map.remove(second);
          map.remove(nums[q]);
          continue;
        }
        
           else if(map.containsKey(first) ||map.containsKey(second))
           {
             ++counter;
             map.remove(nums[q]);
             /*if(map.containsKey(first))  
             map.remove(first);
             else if(map.containsKey(second))
             map.remove(second);
             */
             continue;
           }
          if(map.containsKey(nums[q]))
          map.remove(nums[q]);
    }
        return counter;
  }
}
