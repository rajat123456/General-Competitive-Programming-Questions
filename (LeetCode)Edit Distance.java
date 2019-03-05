//Problem->https://leetcode.com/problems/edit-distance/description/

//Time Comp-> O(m*n), "m"= length of 1st stirng and "n"= length of 2nd string->This much Unique calls
//Space Comp-> O(m*n)

//Solution using Top Down Memoization DP

class Solution {
    public int minDistance(String word1, String word2) {
        
      if(word1.length()==0)
         return word2.length();
      
       if(word2.length()==0)
         return word1.length();  
        
      int storage[][]=new int[word1.length()][word2.length()];
      for(int[]ar:storage)
        Arrays.fill(ar,-1);
      
      return edit(word1,word2,storage,0,0);
}
  
  static int edit(String s1, String s2, int[][]storage, int start, int end)
  {
       if(s1.length()==0)
         return s2.length();
      
       if(s2.length()==0)
         return s1.length();
      
       if(storage[start][end]!=-1)
         return storage[start][end];
    
      if(s1.charAt(0)==s2.charAt(0))
      {
        storage[start][end]=edit(s1.substring(1), s2.substring(1),storage,start+1,end+1);
        return storage[start][end]; 
      }
      
      else
      {
        //Insert
        int op1=edit(s1,s2.substring(1),storage,start,end+1);
        
        //Delete
        int op2=edit(s1.substring(1),s2,storage,start+1,end);
        
        //Substitute/Replace
        int op3=edit(s1.substring(1),s2.substring(1),storage,start+1,end+1);
        
        storage[start][end]=1+Math.min(op1, Math.min(op2,op3));
        return storage[start][end];
      }
	}
}
