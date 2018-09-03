//Problem-> https://www.spoj.com/problems/AGGRCOW/
//Time Comp->O(N*log(N))
//Technique->Binary Search

import java.util.*;

public class Main {
  
	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      
      for(int i=0;i<t;i++)
      {
        int n=sc.nextInt();
        int c=sc.nextInt();
        long[]arr=new long[n];
        long ans=-1;
        for(int q=0;q<n;q++)
        {
          arr[q]=sc.nextLong();
        }
        
        Arrays.sort(arr);
        long start=0;
        long end=arr[arr.length-1]-arr[0];
        
        while(start<=end)
        {
          long mid=(start+end)/2;
          int cows=c-1;
          int check=0;
          
          for(int j=1;j<arr.length;j++)
          {
            if(Math.abs(arr[j]-arr[check])>=mid)
            {
               check=j;
              --cows;
              
              if(cows==0)
                break;
            }
          }
          
          if(cows==0)
            {
              start=mid+1;
              ans=mid;
            }
            
            else
            {
              end=mid-1;
            }
        }
        
        System.out.println(ans);
      }
	}
}
