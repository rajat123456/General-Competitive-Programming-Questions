//Division and Remainder without using / and % operators 
//Time Complexity O(n)
//Space Complexity O(1)

import java.util.*;
public class Main
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    int d=sc.nextInt();
	    for(int i=0;i<d;i++)
	     {
	         int a=sc.nextInt();
		 int b=sc.nextInt();
	         int q=0;
		    if(b==0)
		    {
			System.out.println("Undefine");
			return;
		    }
		    else
		    {
		         while(a>=b)
		       {
		         a=a-b;
		         ++q;
		       }
		    }
		    
		      System.out.println("Quotient is "+q);
		      System.out.println("Remainder is "+a);
		     
	     }
}
}
