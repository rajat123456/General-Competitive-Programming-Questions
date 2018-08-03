//Problem: https://www.spoj.com/problems/MST1/

import java.util.*;
import java.lang.*;
 
public class Main
{  
	static int storage[]=new int[2*10000000+1];
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        for(int i=1;i<=t;i++)
        {
          int k=sc.nextInt();
           
          System.out.println("Case "+i+": "+countStepsTo1(k));  
        }
    }
    static int countStepsTo1(int n)
    {
     
     if(storage[n]==0)
   {
    for(int i=2;i<=n;i++)
    {
      int min=storage[i-1];
     
      if(i%3==0)
      {
        if(min>storage[i/3])
          min=storage[i/3];
      }
     
      if(i%2==0)
      {
        if(min>storage[i/2])
          min=storage[i/2];
      }
      storage[i]=1+min;
    }
      return storage[n];
   }
   else
   return storage[n];
 }
}
