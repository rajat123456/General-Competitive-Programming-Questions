//Division and Remainder without using / and % operators 
//Time Complexity O(n^2)
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
	         quo(a,b);
	         rem(a,b);
	     }
	     
		}
		static void quo(int a, int b)
		 {
		     
		     int total=0;
		     int divisor=b;
		     int divident=a;
		     if(a==0 && b==0)
		     {
		     System.out.println("Undefined");
		     return;
		     }
		     else if(b>a)
		     {
		     System.out.println("Quotient is 0");
		     return;
		     }
		     int i;
		     for(i=1;i<=a;i++)
		      {
		          total=divisor*i;
		          if(total>divident)
		          {
		          System.out.println("Quotient is "+(i-1));
		          break;
		          }
		          else if(total==divident)
		          {
		          System.out.println("Quotient is "+i);
		          break;
		          }
		     
		      }
		      return;
		           
		 }
		 
		 static void rem(int a, int b)
		 {
		     int divisor=b;
		     int divident=a;
		     int k=a;
		     if(a==0 && b==0)
		     {
		      System.out.println("Undefined");
		      return;
		     }
		      else if(b>a)
		     {
		     System.out.println("Remainder is "+a);
		     return;
		     }
		     else
		     {
		         while(k>=b)
		       {
		        k=k-b;
		       }
		     }
		      System.out.println("Remainder is "+k);
		     
		 }
}
