// Problem Link: https://leetcode.com/problems/intersection-of-two-arrays/submissions/

// Time Complexity: O(nlogn) because of sorting
// Space Complexity: O(1)

--------------------------------------------------

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1=0;
        int p2=0;
        
        ArrayList<Integer>al=new ArrayList<>();
        
        while(p1!=nums1.length && p2!=nums2.length)
        {
            // Case 1: If both matches
            if(nums1[p1]==nums2[p2])
            {
              // Since we need to print unique matches only
              if( (p1==0) || ( (p1>0) && (nums1[p1]!=nums1[p1-1])) )
               al.add(nums1[p1]);
                
                ++p1;
                ++p2;  
                
                
            }
         
            // Case 2: If array1 element > array2 element
            else if(nums1[p1]>nums2[p2])
            ++p2;
            
            // Case 3:If array1 element < array2 element
            else
            ++p1;
            
        }
        
        //Since answer req in array, so converting arraylist to array
        int[]res=new int[al.size()];
        
        
        //copying arraylist elemenst to array
        for(int g=0;g<al.size();g++)
        {
            res[g]=al.get(g);
        }
        
        //return resultant array
        return res;
    }
        
}
