//Problem->https://www.spoj.com/problems/FARIDA/

import java.util.*;
class Main {
	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      
      for(int i=0;i<t;i++)
      {
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        for(int q=0;q<n;q++)
        {
          arr[q]=sc.nextInt();
        }
        
        long storage[]=new long[n];
        Arrays.fill(storage,-1);
        
        System.out.println("Case "+(i+1)+": "+calc(arr,0,storage));
      }
	}
  
  static long calc(int[]arr,int start, long[]storage)
  {
    if(start>=arr.length)
      return 0;
    
    if(storage[start]!=-1)
      return storage[start];
    
    long op1=arr[start]+calc(arr,start+2,storage);
    long op2=calc(arr,start+1,storage);
    
    storage[start]=Math.max(op1,op2);
    return storage[start];
  }
}
