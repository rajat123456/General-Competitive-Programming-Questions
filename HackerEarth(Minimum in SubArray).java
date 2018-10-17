//Problem: https://www.hackerearth.com/practice/data-structures/advanced-data-structures/segment-trees/practice-problems/algorithm/range-minimum-query/

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      int q=sc.nextInt();
      
      int[]arr=new int[n];
      int[]st=new int[4*arr.length];

      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      
      buildtree(arr,st,0,arr.length-1,1);
      sc.nextLine();
      
      for(int r=0;r<q;r++)
      {
        String s=sc.nextLine();
        
        int a=0;
        int b=0;
        int first=2;
        int qq=3;
        for(;qq<s.length();qq++)
        {
          if(s.charAt(qq)==' ')
          {
            a=Integer.parseInt(s.substring(first,qq));
            first=qq+1;
          }
        }
        
        b=Integer.parseInt(s.substring(first,qq));
        
        if(s.charAt(0)=='q')
        {
          System.out.println(query(st, 0, arr.length-1, 1, a-1, b-1));
        }
        
        else
        {
          update(arr,st,0,arr.length-1,1,a-1,b);
        }
      }
	}
  
  static void buildtree(int[]arr, int[]st, int start, int end, int treeIndex)
  {
    int mid=(start+end)/2;
    
    if(start==end)
    {
      st[treeIndex]=arr[start];
      return;
    }
    
    buildtree(arr, st, start, mid, treeIndex*2);
    buildtree(arr, st, mid+1, end, treeIndex*2+1);
    
    st[treeIndex]=Math.min(st[treeIndex*2],st[treeIndex*2+1]);
  }
  
  static void update(int[]arr, int[]st, int start, int end, int treeIndex, int index, int value)
  {
    int mid=(start+end)/2;
    
    if(start==end)
    {
      arr[index]=value;
      st[treeIndex]=value;
      return;
    }
    
    if(index>mid)
      update(arr, st, mid+1, end, treeIndex*2+1, index, value);
    
    else
      update(arr, st, start, mid, treeIndex*2, index, value);
    
    st[treeIndex]=Math.min(st[treeIndex*2],st[treeIndex*2+1]);
  }
  
  static int query(int[]st, int start, int end, int treeIndex, int left, int right)
  {
    //Completely Ooutside
    if(start>right || end<left)
      return Integer.MAX_VALUE;
    
    //Completely Inside
    if(start>=left && end<=right)
      return st[treeIndex];
    
    //Partially Inside and Partially Outside
    int mid=(start+end)/2;
    int ans1=query(st, start, mid, treeIndex*2, left, right);
    int ans2=query(st, mid+1, end, treeIndex*2+1, left, right);
    
    return Math.min(ans1, ans2);
  }
}
