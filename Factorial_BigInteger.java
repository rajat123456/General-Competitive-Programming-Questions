//Calculating Factorials using BigInteger

import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		for(int i=0;i<d;i++)
		{
		    int t=sc.nextInt();
		    BigInteger f=BigInteger.ONE;
		    
		    for(int j=2;j<=t;j++)
		    {
		      f=f.multiply(new BigInteger(j+""));  
		      System.out.println(f);
		    }
		}
	}
}
