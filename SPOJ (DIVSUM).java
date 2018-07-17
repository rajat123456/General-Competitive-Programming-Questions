//https://www.spoj.com/problems/DIVSUM/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int count=0;
		Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
		    long l=0;
		    int k=sc.nextInt();
		    if(k==1)
		    {
		    System.out.println(0);
		    continue;
		    }		    
		    for(int q=1;q<=Math.sqrt(k);q++)
		    { 
		        if(q==1)
		        l+=1;
		        else
		       {
		        if(k%q==0)
		        {
		          if(q==Math.sqrt(k))
		          l+=q;
		          else
		           {
		            l+=q;
		            l+=(k/q);
		           }
		        }
		       }
		    }
		    System.out.println(l);
		}
   }
}
