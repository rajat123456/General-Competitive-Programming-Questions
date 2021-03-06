// Problem: https://leetcode.com/problems/trapping-rain-water/submissions/

/* 
  Time Complexity: O(N)
  Space Complexity: O(1)
*/


    class Solution {
    public int trap(int[] height) {
        
      
            // if given as empty array, answer is 0
            if(height.length==0)
                return 0;
        
            int max=0;
            int index=-1;

            // Finding maximum in whole array
            for(int g=0;g<height.length;g++)
            {
                if(height[g]>max)
                {
                 max=height[g];
                 index=g;
                }
            }

            boolean flag=false;
            int maxr=-1;
      
            // Finding maximum in whole array from right side, so as to conifrm whether the maximum element is unique or duplicated
            for(int z=height.length-1;z>=0;z--)
            {
                if( (height[z]==max) && (z!=index) ) 
                {
                    flag=true;
                    maxr=z;
                    break;
                }
            }

            if(flag==false)
            maxr=index;

            int water=0;
            int left=-1;
            int x=0;
      
            // Scanning array from left to Right
            while(x!=maxr)
            {
                if(height[x]!=0 && left==-1)
                {
                 left=x;
                }

                else if(left!=-1 && height[x]>height[left])
                {
                    left=x;
                }

                else if(left!=-1 && left!=x)
                {
                    water+=height[left]-height[x];
                }

                ++x;
            }

            // This scans array from Right to Left, only if we encountered the maximum element and still there are elements exists in array for scanning
            if(x!=height.length-1)
            {
                int curmax=height[height.length-1];
                int v=height.length-2;
                while(v>x)
                {
                    if(height[v]>curmax)
                        curmax=height[v];
                    
                    else if(height[v]!=curmax)
                        water+=curmax-height[v];
                        
                    --v;
                }
            }

            return water;
      
    }
}
