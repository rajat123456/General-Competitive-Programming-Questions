//Problem-> https://www.spoj.com/problems/INVCNT/

//Counting Inversions in an array Using Merge Sort. 
//Time Comp-> O(Nlogn)

import java.util.*;
class solution {
	
public static void main(String[]args)
{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int q=0;q<t;q++)
	    {
	      int n=sc.nextInt();
	      int[]arr=new int[n];
	      for(int r=0;r<arr.length;r++)
	      {
	      	arr[r]=sc.nextInt();
	      }
	       System.out.println(mergesort(arr,0,arr.length-1)); 
	    }
}

  static long mergesort(int[]arr,int start,int end)
  {
    long val=0;
    if(start>=end)
      return 0;
    
    int mid=(start+end)/2;
    
    val+=mergesort(arr,start,mid);
    val+=mergesort(arr,mid+1,end);
    
    val+=merge(arr,start,end);
    return val; 
  }
  
  static long merge(int[]arr,int start,int end)
  {
    int mid=(start+end)/2;
    int i=start;
    int j=mid+1;
    long val=0;
    int k=0;
    int[]arr2=new int[end-start+1];
    
    while(i<=mid && j<=end)
    {
      if(arr[i]<=arr[j])
      {
        arr2[k]=arr[i];
        ++k;
        ++i;
      }
      
      else
      {
        val+=mid-i+1;
        arr2[k]=arr[j];
        ++k;
        ++j;
      }
    }
    
    if(i>mid)
  {  
    while(j<=end)
   {
      arr2[k]=arr[j];
      ++k;
      ++j;
   }
  }
    
    else if(j>end)
    {
      while(i<=mid)
      {
        arr2[k]=arr[i];
        ++k;
        ++i;
      }
    }
    
    for(int w=0;w<arr2.length;w++)
    {
      arr[start+w]=arr2[w];
    }
    return val;
  }
}
