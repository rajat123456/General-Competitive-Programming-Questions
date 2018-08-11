//Problem-> https://leetcode.com/problems/minimum-path-sum/description/

class Solution {
    public int minPathSum(int[][] grid) {

    int[][]storage=new int[grid.length][grid[0].length];
    for (int i=0;i<storage.length;i++)
    {
      for(int j=0;j<storage[i].length;j++)
      {
        storage[i][j]=-1;   
      }
    }    
        
    return search(grid,0,0,storage);
}
 
    static int search(int[][]arr, int start, int end,int[][]storage)
    {
        if(start>=arr.length || end>=arr[0].length)
           return Integer.MAX_VALUE;
        
        if(storage[start][end]!=-1)
            return storage[start][end];
        
        if(start==arr.length-1 && end==arr[0].length-1)
       {
        storage[start][end]=arr[start][end];
            return storage[start][end];
       }
        
       int option1=search(arr,start,end+1,storage);
       int option2=search(arr,start+1,end,storage);
        
        storage[start][end]=arr[start][end]+Math.min(option1,option2);
         return storage[start][end];
    }
}
